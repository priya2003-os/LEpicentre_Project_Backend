package co.simplon.epicentre.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.epicentre.dtos.CountryCreateDto;
import co.simplon.epicentre.entities.Country;
import co.simplon.epicentre.services.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
	this.service = service;
    }

    @GetMapping("")
    public List<Country> all() {
	return service.findAll();
    }

    @GetMapping("/{id}")
    public Country geCountrytById(@PathVariable Long id) {
	return service.findById(id);
    }

    @PostMapping("/create-country")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCountry(@RequestBody CountryCreateDto inputs) {
	System.out.println(inputs);
	service.create(inputs);
    }

    @PostMapping("/update")
    public void updateCountry(@RequestBody CountryCreateDto inputs) {
	System.out.println(inputs);
	service.updateCountry(inputs);
    }

    @PostMapping("/delete")
    public void deleteCountry(@RequestBody CountryCreateDto inputs) {
	System.out.println(inputs);
	service.deleteCountry(inputs);
    }

//    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
//    public void updateCountry(@RequestBody Country inCountry, @PathVariable Long id) {
//	this.service.updateCountry(id, inCountry);
//    }

//    @GetMapping("/name")
//    public List<CountryAllDto> name() {
//	return service.findByName();
//    }

//    @GetMapping("/picture")
//    public List<CountryAllDto> picture(String picture) {
//	return service.findByPicture(picture);
//    }
}