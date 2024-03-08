package Backtracking;

import java.util.Arrays;

public class maze_Backtrack {
    public static void main(String[] args) {
        boolean[][] arr = {{true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int [arr.length][arr[0].length];
        backtrackstep("", 0, 0, arr, path, 1);
    }
    static void backtrack(String p, int r, int c, boolean[][] maze){
        if(r == maze.length-1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false; // making the covered path as false.
        if (r < maze.length -1){
            backtrack(p+'D',r+1, c, maze);
        }
        if (c < maze[0].length -1){
            backtrack(p+'R',r, c+1, maze);
        }
        if (r > 0){
            backtrack(p+'U', r-1, c, maze);
        }
        if (c > 0){
            backtrack(p+'L', r, c-1, maze);
        }
        // This will execute at the end of the function.
        maze[r][c] = true; // making it true while coming out of recursion.
    }

    static void backtrackstep(String p, int r, int c, boolean[][] maze, int[][] path, int step){
        if(r == maze.length-1 && c == maze[0].length -1){
            path[r][c] = step;
            for (int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false; // making the covered path as false.
        path[r][c] = step;
        if (r < maze.length -1){
            backtrackstep(p+'D',r+1, c, maze, path, step+1);
        }
        if (c < maze[0].length -1){
            backtrackstep(p+'R',r, c+1, maze, path, step+1);
        }
        if (r > 0){
            backtrackstep(p+'U', r-1, c, maze, path, step+1);
        }
        if (c > 0){
            backtrackstep(p+'L', r, c-1, maze, path, step+1);
        }
        // This will execute at the end of the function.
        maze[r][c] = true; // making it true while coming out of recursion.
        path[r][c] = 0;
    }
}
