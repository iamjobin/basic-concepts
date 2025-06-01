package com.patterns;

public class SimplePattern {

    public static void main(String[] args) {
        diamond(5);
    }

    private static void simpleSquare(int n) {
        System.out.println("__________Simple Square_______________");
        for (int row=1; row<=n; row++) {
            for (int col=1; col<=n; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static void simpleLadderAsc(int n) {
        System.out.println("__________Simple Ladder ASC_______________");
        for (int row=1; row <= n; row++) {
            for (int col=1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static void simpleLadderDsc(int n) {
        System.out.println("__________Simple Ladder DESC_______________");
        for (int row=1; row <= n; row++) {
            for (int col=1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static void simpleNumberLadderAsc(int n) {
        System.out.println("__________Simple Number Ladder ASC_______________");
        for (int row=1; row <= n; row++) {
            for (int col=1; col <= row; col++) {
                System.out.print( col + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static void halfDiamond(int n) {
        System.out.println("__________Half Diamond_______________");
        for (int row=1; row <= n*2; row++) {
            int stars = row<=n ? row : 2*n -row;
                for (int col = 1; col <= stars; col++) {
                    System.out.print("* ");
                }
            System.out.println("");
        }
        System.out.println("");
    }

    private static void diamond(int n) {
        System.out.println("__________Diamond_______________");
        for (int row=1; row <= 2*n - 1; row++) {
            int currentRow = row<=n ? row : 2*n - row;
            for (int space = 0; space < n - currentRow; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < currentRow; star++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
