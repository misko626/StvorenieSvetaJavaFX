package com.example.stvoreniesveta.entity;

import java.util.ArrayList;
import java.util.List;

public class Space {

    private String name;
    private List<Planet> spacePlanets;

    public Space(String name) {
        this.name = name;
        this.spacePlanets = new ArrayList<>();
    }

    public void addPlanet(Planet planet){
        this.spacePlanets.add(planet);
    }

    public void deletePlanet(Planet planet){
        this.spacePlanets.remove(planet);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Planet> getSpacePlanets() {
        return spacePlanets;
    }

    public void setSpacePlanets(List<Planet> spacePlanets) {
        this.spacePlanets = spacePlanets;
    }
}
