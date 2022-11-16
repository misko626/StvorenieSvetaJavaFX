package com.example.stvoreniesveta.entity;

public class Planet {

    private String name;
    private double weight;
    private double diameter;

    public Planet(String name, double weight, double diameter) {
        this.name = name;
        this.weight = weight;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planeta: Meno: ").append(this.name).append(", vaha: ").append(this.weight).append("kg, priemer:").append(this.diameter).append("m");
        return  sb.toString();
    }
}
