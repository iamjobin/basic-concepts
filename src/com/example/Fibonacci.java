package com.example;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the iteration count");
        int iterationCount = in.nextInt();

        int a = 0;
        int b = 1;

        for(int i=0; i<iterationCount; i++) {
            int next = a + b;
            a = b;
            b = next;
            System.out.print(b+ "");
        }

    }

}
