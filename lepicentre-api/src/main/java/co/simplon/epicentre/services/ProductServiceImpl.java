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
    private List<Product>[] product;

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

    @Override
    public List<Product> findNames() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<Product> findProductByCountryId(int countryId, int categoryId) {
	// TODO Auto-generated method stub

	List<Product> list1 = repository.findProductByCountryId(countryId, categoryId);

	List<Product> finalList = new ArrayList<>();

	for (List<Product> list1 : product) {
	    if (product.getCategory() = categoryId) {
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
