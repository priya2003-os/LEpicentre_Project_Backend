package co.simplon.epicentre.services;

import java.util.List;
import java.util.Optional;

import co.simplon.epicentre.entities.Product;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    //List<Product> findNames();

   List<Product> findProductByCountryId(Long country_id, Long category_id);

    /*
     * 
     * List<Product> findByBrand();
     * 
     * List<Product> findById();
     */

}
