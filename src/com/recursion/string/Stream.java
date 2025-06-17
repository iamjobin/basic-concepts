package com.recursion.string;

public class Stream {

    public static void main(String[] args) {
        System.out.println(skipAppNotApple("baccdapph"));
    }

    private static void skipCharacterA(String result, String input) {
        if (input.isEmpty()) {
           System.out.println(result);
           return;
        }
        char ch = input.charAt(0);

        if (ch == 'a') {
            skipCharacterA(result, input.substring(1));
        } else {
            skipCharacterA(result+ch, input.substring(1));
        }
    }

    private static String skipCharacterA(String input) {
        if (input.isEmpty()) {
            return "";
        }
        char ch = input.charAt(0);

        if (ch == 'a') {
           return skipCharacterA(input.substring(1));
        } else {
           return ch + skipCharacterA(input.substring(1));
        }
    }

    private static String skipString(String input) {
        if (input.isEmpty()) {
            return "";
        }

        if (input.startsWith("apple")) {
            return skipString(input.substring(5));
        } else {
            return input.charAt(0) + skipString(input.substring(1));
        }
    }

    private static String skipAppNotApple(String input) {
        if (input.isEmpty()) {
            return "";
        }

        if (input.startsWith("app") && !input.startsWith("apple")) {
            return skipAppNotApple(input.substring(3));
        } else {
            return input.charAt(0) + skipAppNotApple(input.substring(1));
        }
    }

}
