package com.oop.singleton;

public class SingleTon {

    private SingleTon() {

    }

    private static SingleTon instance;

    public static SingleTon getInstance() {
        if(instance == null){
            instance = new SingleTon();
        }
        return instance;
    }

}
