package com.oop.cloning;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Human jobin = new Human(23, "Jobin");

        Human twin = (Human)jobin.clone();

        System.out.println(twin.age);
        System.out.println(twin.name);
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(jobin.arr));

    }

}
