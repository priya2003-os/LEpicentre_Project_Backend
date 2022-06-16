package co.simplon.epicentre.services;

import java.util.List;
import java.util.Optional;

import co.simplon.epicentre.dtos.ProductCreateDto;
import co.simplon.epicentre.entities.Product;

import javax.transaction.Transactional;

public interface ProductService {

    List<Product> findAll();

    Product findById(Long id);

    //List<Product> findNames();

   List<Product> findProductByCountryId(Long country_id, Long category_id);

    @Transactional
    void updateProduct(ProductCreateDto inputs);

    /*
     * 
     * List<Product> findByBrand();
     * 
     * List<Product> findById();
     */

}
