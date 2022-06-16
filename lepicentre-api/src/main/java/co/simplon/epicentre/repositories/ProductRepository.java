package co.simplon.epicentre.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.epicentre.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
//    <T> List<T> findAllProjectedByOrderByName(Class<T> type);


    List<Product> findAll();

   @Override
   Optional<Product> findById(Long id);



    List<Product> findProductByCountryIdAndCategoryId(Long country_id, Long category_id);
}
