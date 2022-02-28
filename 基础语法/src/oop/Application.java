package oop;

import oop.demo02.Pet;

public class Application {
    public static void main(String[] args) {
        Pet dog = new Pet();
        dog.name = "旺财";
        dog.age = 3;
        dog.shout();
        Pet cat = new Pet();
    }
}
