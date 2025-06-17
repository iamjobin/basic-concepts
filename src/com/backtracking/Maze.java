package com.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maze {

    public static void main(String[] args) {
        System.out.println(countWays(3, 3));
        printWays(3, 3, "");
        System.out.println(returnWays(3, 3, ""));

        printWaysDiagonal(3, 3, "");

        boolean maze[][] = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("", maze, 0, 0);
    }

    private static int countWays(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = countWays(r - 1, c);
        int right = countWays(r, c - 1);
        return left + right;
    }

    private static void printWays(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p + "(" + r + "," + c + ") ");
            return;
        }
        p = p + "(" + r + "," + c + ") ";
        if (r > 1) {
            printWays(r - 1, c, p);
        }
        if (c > 1) {
            printWays(r, c - 1, p);
        }
    }

    private static List<String> returnWays(int r, int c, String p) {
        if (r == 1 && c == 1) {
            return new ArrayList<>(Collections.singletonList(p));
        }
        List<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(returnWays(r - 1, c, p + "D"));
        }
        if (c > 1) {
            list.addAll(returnWays(r, c - 1, p + "R"));
        }
        return list;
    }

    private static void printWaysDiagonal(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p + "(" + r + "," + c + ") ");
            return;
        }
        p = p + "(" + r + "," + c + ") ";
        if (r > 1 && c > 1) {
            printWaysDiagonal(r - 1, c - 1, p);
        }
        if (r > 1) {
            printWaysDiagonal(r - 1, c, p);
        }
        if (c > 1) {
            printWaysDiagonal(r, c - 1, p);
        }
    }

    private static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathRestrictions(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestrictions(p + "R", maze, r, c + 1);
        }
    }

}
