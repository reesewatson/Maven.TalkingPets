package io.zipcoder.polymorphism;

public class Alpaca extends Pet {

    public Alpaca() {
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
    public String speak() {
        return "Mehh! Mehhh!";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
