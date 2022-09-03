package org.example;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Myrka", 2));
        animals.add(new Dog("Tuzik", 5));
        animals.add(new Cow("Burenka", 3));
        animals.add(new Puppy("Guchka", 0));
        printAnimals(animals);
    }
    public static void printAnimals (ArrayList<Animal> animals){
        for (Animal animal : animals ){
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            System.out.println("Voice: " + animal.voice());
            System.out.println();
        }
    }
}