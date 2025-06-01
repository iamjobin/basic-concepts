package com.oop.generics.compare;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student a = new Student(1, 98);

        Student b = new Student(2, 89);

        Student c = new Student(3, 78);

        Student d = new Student(4, 90);

        Student[] students = {a, b, c, d};

//        sort uses comparable for sorting.
        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

//        if(a.compareTo(b)>0) {
//            System.out.println("A is scored greater than B.");
//        }

    }

}
