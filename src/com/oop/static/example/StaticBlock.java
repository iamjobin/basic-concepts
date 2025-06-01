package com.oop.static_example;

public class StaticBlock {

    static int a = 10;

    static int b = 2;

    static {
        System.out.println("In static block");
        b = b * a;
    }

    public static void main(String[] args) {
        StaticBlock staticBlock1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 10;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }

}
