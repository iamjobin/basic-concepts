package com.backtracking;


import java.util.Arrays;

// make a change and revert the change - thought process for backtracking.
public class AllPathWayMaze {

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        allPaths(maze, 0, 0, "");
        int[][] paths = new int[maze.length][maze[0].length];
        printAllPathsInDecentManner(maze, 0, 0, "", 1, paths);
    }

    private static void allPaths(boolean[][] maze, int r, int c, String p) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

//        I take this in my path
        maze[r][c] = false;
        if (r < maze.length - 1) {
            allPaths(maze, r + 1, c, p + "D");
        }
        if (c < maze[0].length - 1) {
            allPaths(maze, r, c + 1, p + "R");
        }
        if (r > 0) {
            allPaths(maze, r - 1, c, p + "U");
        }
        if (c > 0) {
            allPaths(maze, r, c - 1, p + "L");
        }
//        revert the change after process it
        maze[r][c] = true;
    }

    private static void printAllPathsInDecentManner(
            boolean[][] maze, int r, int c, String p, int step, int[][] paths
    ) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println();
            System.out.println(p);
            paths[r][c] = step;
            for (int[] path : paths) {
                System.out.println(Arrays.toString(path));
            }
            return;
        }
        if (!maze[r][c]) {
            return;
        }

//        I take this in my path
        maze[r][c] = false;
        paths[r][c] = step;
        if (r < maze.length - 1) {
            printAllPathsInDecentManner(maze, r + 1, c, p + "D", step + 1, paths);
        }
        if (c < maze[0].length - 1) {
            printAllPathsInDecentManner(maze, r, c + 1, p + "R", step + 1, paths);
        }
        if (r > 0) {
            printAllPathsInDecentManner(maze, r - 1, c, p + "U", step + 1, paths);
        }
        if (c > 0) {
            printAllPathsInDecentManner(maze, r, c - 1, p + "L", step + 1, paths);
        }
//        revert the change after process it
        maze[r][c] = true;
        paths[r][c] = 0;
    }

}
