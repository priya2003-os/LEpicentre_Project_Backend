package co.simplon.epicentre.controllers;

import java.util.List;
import java.util.Optional;

import co.simplon.epicentre.entities.Category;
import co.simplon.epicentre.entities.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.epicentre.entities.Product;
import co.simplon.epicentre.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
	this.service = service;
    }

    @GetMapping("")
    public List<Product> Allproducts() {
	return service.findAll();
    }

   /* @GetMapping("/name")
    public List<Product> names() {
	return service.findNames();
    }*/

    @GetMapping("/by-country")
    public Optional<Product> byCountry(@RequestParam("id") Long id) {
	return service.findById(id);
    }

    @GetMapping("/by-category")
    public Optional<Product> byCategory(@RequestParam("id") Long id) {
	return service.findById(id);
    }

    @GetMapping("/by-product-country-category")
    public List<Product> byCountryCategory(Long country_id, Long category_id) {
	return service.findProductByCountryId(country_id, category_id);
    }

}
