package com.oop.polymorphism;

public class ObjectPrint {

    int n;

    @Override
    public String toString() {
        return "ObjectPrint : " + this.n;
    }

    public static void main(String[] args) {
        ObjectPrint objectPrint = new ObjectPrint();
        System.out.println(objectPrint.toString());
    }

}
