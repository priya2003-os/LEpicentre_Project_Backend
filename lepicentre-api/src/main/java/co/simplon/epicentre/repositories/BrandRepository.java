package co.simplon.epicentre.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.epicentre.entities.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
    <T> List<T> findAllProjectedByOrderByName(Class<T> type);

}
