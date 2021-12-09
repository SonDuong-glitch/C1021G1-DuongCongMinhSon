package week2.abstractClass_interface.thuchanh.animal;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken said: Oooo";
    }

    @Override
    public String howToEat() {
        return "could be fired";
    }
}
