package com.example;

public class Occurrence {

    public static void main(String[] args) {
        int num = 1727890;
        int toFindOc = 0;
        int count=0;

        while (num>0) {
            int lastDigit = num % 10;
            if(lastDigit == toFindOc) {
                count++;
            }
            num = num/10;
        }

        System.out.println("Occurrence Count : "+count);
    }

}
