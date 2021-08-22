package com.github.rafaelmendes1.citiesapi.controllers;

import com.github.rafaelmendes1.citiesapi.entities.Country;
import com.github.rafaelmendes1.citiesapi.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryRepository repository;

    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);
    }
}
