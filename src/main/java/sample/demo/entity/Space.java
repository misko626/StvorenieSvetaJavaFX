package sample.demo.entity;

import java.util.*;

public class Space {

    private String meno;
    private List<Planeta> polePlanet;

    public Space(String meno) {
        this.meno = meno;
        this.polePlanet = new ArrayList<>();
    }



    public void addPlanet(Planeta planeta){
        this.polePlanet.add(planeta);
    }

    public void deletePlaneta(Planeta planeta){
        this.polePlanet.remove(planeta);
    }

    public List<Planeta> getPolePlanet() {
        return polePlanet;
    }

    public void setPolePlanet(List<Planeta> polePlanet) {
        this.polePlanet = polePlanet;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    @Override
    public String toString() {
        return "Space{" +
                "polePlanet=" + polePlanet +
                '}';
    }
}
