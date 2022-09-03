package org.example;

public class Cow extends Animal{
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public String voice() {
        String voice = "Muuu";
        return voice;
    }
}
