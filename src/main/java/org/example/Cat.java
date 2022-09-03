package org.example;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String voice() {
        String voice = "May";
        return voice;
    }
}
