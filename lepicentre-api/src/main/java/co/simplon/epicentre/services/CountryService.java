package co.simplon.epicentre.services;

import java.util.List;

import co.simplon.epicentre.dtos.CountryCreateDto;
import co.simplon.epicentre.entities.Country;

public interface CountryService {

    List<Country> findAll();

    Country findById(Long id);

    void create(CountryCreateDto inputs);

    void updateCountry(CountryCreateDto inputs);

    void deleteCountry(CountryCreateDto inputs);

    // Country updateCountryById(Long id);

    // void updateCountryById(Long id, @Valid CountryUpdateDto country);

//    List<CountryAllDto> findByName();

//    List<CountryAllDto> findByPicture(String picture);

}
