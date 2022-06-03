package co.simplon.epicentre.controllers;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/name")
    public List<Product> names() {
	return service.findNames();
    }

    @GetMapping("/by-country")
    public Optional<Product> byCountry(@RequestParam("id") Long id) {
	return service.findById(id);
    }

    @GetMapping("/by-category")
    public Optional<Product> byCategory(@RequestParam("id") Long id) {
	return service.findById(id);
    }

}
