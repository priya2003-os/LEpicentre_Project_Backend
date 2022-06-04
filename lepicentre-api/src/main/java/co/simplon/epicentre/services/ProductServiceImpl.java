package co.simplon.epicentre.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.simplon.epicentre.entities.Product;
import co.simplon.epicentre.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
	this.repository = repository;

    }

//    @Override
//    public List<Product> findNames() {
//
//	return repository.findAllProjectedByOrderByName(Product.class);
//    }

    @Override
    public Optional<Product> findById(Long id) {

	return repository.findById(id);
    }

    @Override
    public List<Product> findAll() {

	return repository.findAll();
    }

   /* @Override
    public List<Product> findNames() {
	// TODO Auto-generated method stub
	return null;
    }*/

    @Override
    public List<Product> findProductByCountryId(Long country_id, Long category_id) {
	// TODO Auto-generated method stub

	List<Product> products = repository.findProductByCountryIdAndCategoryId(country_id, category_id);

	List<Product> finalList = new ArrayList<>();

	for (Product product : products) {
	    if (product.getCategory().getId() == category_id) {
		finalList.add(product);
	    }
	}

//	String name = product.getName();
//	String country = product.getCountry();
//	
//	ProductDto productDto = new ProductDto();

	return finalList;

    }

}
