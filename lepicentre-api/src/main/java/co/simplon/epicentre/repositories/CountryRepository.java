package co.simplon.epicentre.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.epicentre.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    /* <T> List<T> findAllProjectedBy(Class<T> type); */

    @Override
    List<Country> findAll();

    @Override
    Optional<Country> findById(Long id);

//    List<CountryAllDto> findByName();

    /* List<CountryAllDto> findByPicture(String picture); */
}
