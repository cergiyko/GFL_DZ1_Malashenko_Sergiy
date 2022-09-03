package org.example;

public abstract class Animal {


    private String name;
    private int age;

    public  String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public Animal(String name, int age){
        if(name.length() < 2){
            System.out.println("Name is not correct");
        }
        else this.name = name;
        if(age < 0 || age > 30){
            System.out.println("Age must be > 0 and < 30 ");
        }
        else this.age = age;
    }

    public abstract String voice();
}
