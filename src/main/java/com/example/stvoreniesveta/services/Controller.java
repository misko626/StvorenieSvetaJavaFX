package com.example.stvoreniesveta.services;

import com.example.stvoreniesveta.entity.Planet;
import com.example.stvoreniesveta.entity.Space;

public class Controller {

    public Space mySpace;
    public Planet currentPlanet;

    public Space getMySpace() {
        return mySpace;
    }

    public void setMySpace(Space mySpace) {
        this.mySpace = mySpace;
    }

    public Planet getCurrentPlanet() {
        return currentPlanet;
    }

    public void setCurrentPlanet(Planet currentPlanet) {
        this.currentPlanet = currentPlanet;
    }
}
