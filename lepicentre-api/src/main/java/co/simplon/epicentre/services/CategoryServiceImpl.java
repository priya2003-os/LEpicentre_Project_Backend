package co.simplon.epicentre.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import co.simplon.epicentre.entities.Category;
import co.simplon.epicentre.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    public CategoryServiceImpl(CategoryRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<Category> findAll() {

	List<Category> categories = repository.findAll();
	return categories;
    }

    @Override
    public Category findById(Long id) {
	Category category = repository.findById(id)
		.orElseThrow(() -> new EntityNotFoundException(String.format("Resource not found", id)));

	return category;

    }

}
