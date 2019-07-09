package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Tests{

    @Test
    public void speak() {
        //Given
        Alpaca alpaca = new Alpaca();
        String expected = "Mehh! Mehhh!";

        //When
        String actual = alpaca.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak2() {
        //Given
        Cat cat = new Cat();
        String expected = "Meow, meow.";

        //When
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak3() {
        //Given
        Dog dog = new Dog();
        String expected = "Bark! Bark!";

        //When
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak4() {
        //Given
        GoldFish goldFish = new GoldFish();
        String expected = "Bloop, bloop, bloop!";

        //When
        String actual = goldFish.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak5() {
        //Given
        Horse horse = new Horse();
        String expected = "Neigh! Neigh!";

        //When
        String actual = horse.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
