package io.zipcoder.polymorphism;

public class Cat extends Pet{

    public Cat() {
    }

    @Override
    public String speak() {
        return "Meow, meow.";
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
