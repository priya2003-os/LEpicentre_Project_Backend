package co.simplon.epicentre.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.epicentre.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
//    <T> List<T> findAllProjectedByOrderByName(Class<T> type);

    @Override
    List<Product> findAll();

    List<Product> findProductByCountryId(int countryId, int categoryId);

}
