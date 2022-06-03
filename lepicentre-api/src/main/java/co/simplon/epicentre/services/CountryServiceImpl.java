package co.simplon.epicentre.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import co.simplon.epicentre.dtos.CountryCreateDto;
import co.simplon.epicentre.entities.Country;
import co.simplon.epicentre.repositories.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository repository;

    public CountryServiceImpl(CountryRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<Country> findAll() {

	return repository.findAll();
    }

//    @Override
//    public List<CountryAllDto> findByName() {
//
//	return repository.findByName();
//    }

//    @Override
//    public List<CountryAllDto> findByPicture(String picture) {
//
//	return repository.findByPicture(picture);
//    }
//
    @Override
    public Country findById(Long id) {
	Country country = repository.findById(id).orElseThrow(
		() -> new EntityNotFoundException(String.format("Ce pays n'existe pas en base de données", id)));

	return country;
    }

    @Transactional
    @Override
    public void create(CountryCreateDto inputs) {
	Country country = new Country();
	country.setName(inputs.getName());
	country.setPicture(inputs.getPicture());
	repository.save(country);
    }

//    @Override
//    public void updateCountry(Long id, Country inCountry) {
//	List<Country> country = null;
//	for (int i = 0; i < country.size(); i++) {
//	    Country country1 = country.get(i);
//	    if (country1.getId().equals(id)) {
//		country.set(i, country1);
//		return;
//	    }
//	}
//
//    }
    @Transactional
    @Override
    public void updateCountry(CountryCreateDto inputs) {

	Country country = repository.findById(inputs.getId()).get();

	country.setName(inputs.getName());
	country.setPicture(inputs.getPicture());
	repository.save(country);

    }

    public void deleteCountry(CountryCreateDto inputs) {

	Country country = repository.findById(inputs.getId()).get();
	repository.delete(country);
    }

}
