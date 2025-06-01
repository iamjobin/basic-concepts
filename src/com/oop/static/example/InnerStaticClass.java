package com.oop.static_example;

public class InnerStaticClass {
    static String d;
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
            InnerStaticClass.d = "Ex";
        }
    }

    public static void main(String[] args) {
        Test a = new Test("One");
        Test b = new Test("two");
        InnerStaticClass.Test nt1 = new InnerStaticClass.Test("three");
        InnerStaticClass.Test nt2 = new InnerStaticClass.Test("four");

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(nt1.name);
        System.out.println(nt2.name);
        System.out.println("Static Variable 'd': " + InnerStaticClass.d);
    }

}
