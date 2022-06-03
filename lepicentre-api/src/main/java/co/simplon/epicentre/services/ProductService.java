package co.simplon.epicentre.services;

import java.util.List;
import java.util.Optional;

import co.simplon.epicentre.entities.Product;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    List<Product> findNames();

    List<Product> findProductByCountryId(int countryId, int categoryId);

    /*
     * 
     * List<Product> findByBrand();
     * 
     * List<Product> findById();
     */

}
