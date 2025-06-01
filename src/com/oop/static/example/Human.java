package com.oop.static_example;

public class Human {

    int age;

    String name;

    int salary;

    static int population;

    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }

    static void printName() {
        //we can't use `this` and `super` in static context, because that needs object.
//        System.out.println(this.name);
    }

    void printNameNonStatic() {
        System.out.println(this.name);
    }

    static void printPopulation() {
        System.out.println(Human.population);
    }

}
