package io.zipcoder.polymorphism;

public class Horse extends Pet {

    public Horse() {
    }

    @Override
    public String speak() {
        return "Neigh! Neigh!";
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
