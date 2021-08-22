package com.github.rafaelmendes1.citiesapi.staties.controllers;

import com.github.rafaelmendes1.citiesapi.staties.entities.State;
import com.github.rafaelmendes1.citiesapi.staties.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateController {

    private StateRepository repository;

    @Autowired
    public StateController(StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }
}
