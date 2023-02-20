package com.example.superherov3.services;

import com.example.superherov3.model.Superhero;
import com.example.superherov3.repositories.SuperheroRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroService {
    private SuperheroRepo repository;

    public SuperheroService(SuperheroRepo message) {
        this.repository = new SuperheroRepo();
    }

    public List<Superhero> getSuperheroList() {
        return repository.getHeroList();
    }

    /*public Superhero getSuperhero() {
        return repository.getHeroList();
    }*/

    public Superhero getSuperhero(String name) {
        return repository.getSuperhero(name);
    }

    public Superhero postSuperhero(Superhero superhero) {
        return repository.addSuperhero(superhero);
    }

    public String deleteSuperhero(String name) {
        return repository.deleteSuperhero(name);
    }

    public Superhero changeSuperhero(Superhero superhero) {
        return repository.changeSuperhero(superhero);
    }
}
