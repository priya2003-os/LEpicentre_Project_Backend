package co.simplon.epicentre.controllers;

import java.util.List;
import java.util.Optional;

import co.simplon.epicentre.dtos.ProductCreateDto;
import co.simplon.epicentre.entities.Category;
import co.simplon.epicentre.entities.Country;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/by-product-country-category/{countryId}/{categoryId}")
    public List<Product> byCountryCategory(@PathVariable Long countryId,@PathVariable Long categoryId) {
	return service.findProductByCountryId(countryId, categoryId);
    }

    @PostMapping("/update")
    public void updateProduct(@RequestBody ProductCreateDto inputs) {
        System.out.println(inputs);
        service.updateProduct(inputs);
    }


}
