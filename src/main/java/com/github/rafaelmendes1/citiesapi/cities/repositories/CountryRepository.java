package com.github.rafaelmendes1.citiesapi.cities.repositories;

import com.github.rafaelmendes1.citiesapi.cities.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}