package co.simplon.epicentre.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.epicentre.entities.Category;
import co.simplon.epicentre.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
	this.service = service;
    }

    @GetMapping("/all")
    public List<Category> findAllCategory() {
	return service.findAll();
    }

    @GetMapping("/{id}")
    public Category findByCategory(@PathVariable(value = "id") Long id) {
	return service.findById(id);
    }

}
