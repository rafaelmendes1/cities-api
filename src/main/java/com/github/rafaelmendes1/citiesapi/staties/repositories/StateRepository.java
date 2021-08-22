package com.github.rafaelmendes1.citiesapi.staties.repositories;

import com.github.rafaelmendes1.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
