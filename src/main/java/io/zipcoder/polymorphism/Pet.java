package io.zipcoder.polymorphism;

public abstract class Pet implements Animal {

    private String name;

    public Pet() {
    }

    public String speak() {
        return "speak";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This Pet's name is " + getName() + ".\n" +
                "When " + getName() + " speaks, he/she says " + speak() + "\n" +
                "Can you guess what " + getName() + " is?\n" +
                "\n";
    }

    public static void main(String[] args) {
        Alpaca alpaca = new Alpaca();
        alpaca.setName("Sally");
        System.out.println(alpaca.speak());
        System.out.println(alpaca.toString());

        Cat cat = new Cat();
        cat.setName("Nightingale");
        System.out.println(cat.speak());
        System.out.println(cat.toString());

        Dog dog = new Dog();
        dog.setName("Charlie");
        System.out.println(dog.speak());
        System.out.println(dog.toString());

        GoldFish goldfish = new GoldFish();
        goldfish.setName("Larry");
        System.out.println(goldfish.speak());
        System.out.println(goldfish.toString());

        Horse horse = new Horse();
        horse.setName("Dixie");
        System.out.println(horse.speak());
        System.out.println(horse.toString());
    }
}
