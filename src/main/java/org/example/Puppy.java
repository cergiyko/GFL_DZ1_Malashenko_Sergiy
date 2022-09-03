package org.example;

public class Puppy extends Dog{

    public Puppy(String name,int  age) {
        super(name, age);
    }
    @Override
    public String voice() {
        String voice = "Skaw";
        return voice;
    }
}
