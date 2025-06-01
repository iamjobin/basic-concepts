package com.oop.final_example;

public class FinalKeyWord {

    public static void main(String[] args) {
        Student jobin = new Student("JOBIN");
        final Student student = new Student("EX");
        student.name = "fg";

        //Can't reassign final primitive
//        student.num = 0;

        //Also can't reassign final non-primitive
//        student = jobin;
    }
}

