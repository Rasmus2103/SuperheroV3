package com.example.superherov3.model;

import java.util.ArrayList;

public class Superhero {

    private String superheroName;
    private double superheroHeight;
    private String superheroPower;
    private String superheroWeakness;
    private boolean superheroHumanOrNot;


    //Konstruktør
    public Superhero(String superheroName, double superheroHeight, String superheroPower, String superheroWeakness, boolean superheroHumanOrNot) {
        this.superheroName = superheroName;
        this.superheroHeight = superheroHeight;
        this.superheroPower = superheroPower;
        this.superheroWeakness = superheroWeakness;
        this.superheroHumanOrNot = superheroHumanOrNot;
    }


    //get methods
    public String getSuperheroName() {
        return superheroName;
    }

    public double getSuperheroHeight() {
        return superheroHeight;
    }

    public String getSuperheroPower() {
        return superheroPower;
    }


    public String getSuperheroWeakness() {
        return superheroWeakness;
    }

    public boolean getSuperheroHumanOrNot() {
        return superheroHumanOrNot;
    }

    //set methods
    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public void setSuperheroHeight(double superheroHeight) {
        this.superheroHeight = superheroHeight;
    }

    public void setSuperheroPower(String superheroPower) {
        this.superheroPower = superheroPower;
    }

    public void setSuperheroWeakness(String superheroWeakness) {
        this.superheroWeakness = superheroWeakness;
    }

    Boolean setSuperheroHumanOrNot(Boolean superheroHumanOrNot) {
        this.superheroHumanOrNot = superheroHumanOrNot;
        return superheroHumanOrNot;
    }

}
