package com.oop.interfaces;

public class Car implements Engine, Brake{

    int n;

    @Override
    public void brake() {
        System.out.println("Brake executes.");
    }

    @Override
    public void start() {
        System.out.println("Brake executes.");
    }

    @Override
    public void stop() {
        System.out.println("Brake executes.");
    }

}
