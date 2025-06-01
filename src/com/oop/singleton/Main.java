package com.oop.singleton;

public class Main {

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();

        System.out.println(singleTon.toString());
    }

}
