package com.oop.static_example;

public class Main {

    public static void main(String[] args) {
        Human jobin = new Human(23, "Jobin", 30000);
        Human virat = new Human(33, "Virat", 50000);
        System.out.println(jobin.name);
        System.out.println(virat.name);
        //But for convenience we have to use class name to call static things
        System.out.println(jobin.population);
        //like this
        System.out.println(Human.population);
    }

}
