package io.zipcoder.polymorphism;

public class GoldFish extends Pet {

    public GoldFish() {
    }

    @Override
    public String speak() {
        return "Bloop, bloop, bloop!";
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
