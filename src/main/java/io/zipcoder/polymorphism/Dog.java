package io.zipcoder.polymorphism;

public class Dog extends Pet {

    public Dog() {
    }

    @Override
    public String speak() {
        return "Bark! Bark!";
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
