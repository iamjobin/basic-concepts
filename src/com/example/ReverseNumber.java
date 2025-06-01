package com.example;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 23579;

        int finalNum = 0;

        while(num>0) {
            int lastDigit = num % 10;
            finalNum = finalNum*10 + lastDigit;
            num /= 10;
        }

        System.out.println(finalNum);

    }
}
