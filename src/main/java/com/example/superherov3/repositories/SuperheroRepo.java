package com.example.superherov3.repositories;

import com.example.superherov3.model.Superhero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperheroRepo {
    ArrayList<Superhero> heroList = new ArrayList<>(List.of(
            new Superhero("Supermand", 1.90, "Laserøjne", "Kryptonit", false),
            new Superhero("Batman", 1.95, "Kampsport", "Jokeren", true)
    ));
    public SuperheroRepo() {

    }

    /*public void addHeroToDatabase(String heroName, double heroHeight, String heroPower, String heroWeakness, boolean heroHumanOrNot) {
        heroList.add(new Superhero(heroName, heroHeight, heroPower, heroWeakness, heroHumanOrNot));
    }*/

    public Superhero addSuperhero(Superhero superhero) {
        heroList.add(superhero);
        return superhero;
    }

    public Superhero getSuperhero(String name) {
        for (Superhero superheroName: heroList) {
            if(superheroName.getSuperheroName().contains(name)) {
                return superheroName;
            }
        }
        return null;
    }

    /*public Superhero deleteSuperhero(String name) {
        Superhero superhero = getSuperhero(name);
        int index = heroList.indexOf(superhero);
        heroList.remove(index);

        return superhero;
    }*/

    public String deleteSuperhero(String name) {
        for (Superhero search: heroList) {
            if(search.getSuperheroName().contains(name)) {
                heroList.remove(search);
                return "Superhero deleted";
            }
        }
        return null;
    }

    /*public String deleteSuperhero(String name) {
        int i = 0;
        while(i < heroList.size()) {
            if(heroList.get(i).getSuperheroName().equals(name)) {
                heroList.remove(i);
                return name;
            }
            i++;
        }
        return name;
    }*/

    public ArrayList<Superhero> getHeroList() {
        return heroList;
    }

    public void setHeroList(ArrayList <Superhero> heroList) {
        this.heroList = heroList;
    }

    public Superhero changeSuperhero(Superhero superhero) {
        int i = 0;
        while(i < heroList.size()) {
            if(superhero.getSuperheroName().contains(heroList.get(i).getSuperheroName())) {
                heroList.set(i, superhero);
                return superhero;
            }
            i++;
        }
        return null;
    }

}
