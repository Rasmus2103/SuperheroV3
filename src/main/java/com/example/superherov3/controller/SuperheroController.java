package com.example.superherov3.controller;

import com.example.superherov3.model.Superhero;
import com.example.superherov3.services.SuperheroService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/")
public class SuperheroController {
    private SuperheroService superheroService;

    public SuperheroController(SuperheroService superheroService) {
        this.superheroService = superheroService;
    }

    @GetMapping(path="superhelte")
    public ResponseEntity<List<Superhero>> getSuperhero() {
        List superheroList = superheroService.getSuperheroList();
        return new ResponseEntity<List<Superhero>>(superheroList, HttpStatus.OK);
    }

    @GetMapping(path = "superhelte/{name}")
    public ResponseEntity<String> getSuperhero(@PathVariable String name) {
        Superhero superhero = superheroService.getSuperhero(name);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type","text/html");

        return new ResponseEntity<String>(
                "<html><body><h1>" +
                        superhero.getSuperheroName() + " " +
                        superhero.getSuperheroPower() + " " +
                        superhero.getSuperheroWeakness() + " " +
                        superhero.getSuperheroHeight() + " " +
                        superhero.getSuperheroHumanOrNot() +
                        "</h1></body></html>"
                ,responseHeaders, HttpStatus.OK);

    }

    @DeleteMapping(path="superhelte/slet/{name}")
    public ResponseEntity<String> deleteSuperhero(@PathVariable String name) {
        return new ResponseEntity<String>(superheroService.deleteSuperhero(name), HttpStatus.OK);
    }

    @PostMapping(path="superhelte/opret")
    public ResponseEntity<Superhero> postSuperhero(@RequestBody Superhero superhero) {
        Superhero superheroOpret = superheroService.postSuperhero(superhero);
        return new ResponseEntity<Superhero>(superheroOpret, HttpStatus.OK);
    }

    @PutMapping(path="superhelte/ret")
    public ResponseEntity<Superhero> changeSuperhero(@RequestBody Superhero superhero){
        Superhero superheroRet = superheroService.changeSuperhero(superhero);
        return new ResponseEntity<Superhero>(superheroRet, HttpStatus.OK);
    }

}
