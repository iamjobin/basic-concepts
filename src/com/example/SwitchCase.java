package com.example;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        switch (a) {
            case "Apple":
                System.out.println("case 1");
                break;
            case "Orange":
                System.out.println(("case 2"));
                break;
            default:
                System.out.println("invalid input");
        }
    }

}
