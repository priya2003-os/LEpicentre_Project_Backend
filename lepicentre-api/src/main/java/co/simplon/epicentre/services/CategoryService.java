package co.simplon.epicentre.services;

import java.util.List;

import co.simplon.epicentre.entities.Category;

public interface CategoryService {

    List<Category>

	    findAll();

    Category findById(Long id);

}
