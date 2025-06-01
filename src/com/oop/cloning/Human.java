package com.oop.cloning;

import java.util.HashMap;
import java.util.Map;

public class Human implements Cloneable {

    int age;

    String name;

    int[] arr;


    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3};
    }

    //shallow copy
    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
        this.arr = other.arr;
    }

    //shallow copy
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    //deep copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        Human copy = (Human) super.clone();
        int[] copyArr = new int[copy.arr.length];
        System.arraycopy(this.arr, 0, copyArr, 0, this.arr.length);
        copy.arr = copyArr;
        return copy;
    }

}
