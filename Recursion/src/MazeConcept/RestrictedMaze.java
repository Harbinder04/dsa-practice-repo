package MazeConcept;

public class RestrictedMaze {
    public static void main(String[] args) {
        boolean[][] arr = {{true, true, true,true},
                {true, true, false, true},
                {true, true, true, true}
        };
        restriction("", 0, 0, arr, 0); // n = nuber of possible moves.
    }
    static int  restriction(String p, int r, int c, boolean[][] maze, int n){
        if(r == maze.length-1 && c == maze[0].length -1){
            System.out.println(p);
            return n+1;
        }
        if (!maze[r][c]){
            return n;
        }
        int newN = n;
        if (r < maze.length -1){
             newN = restriction(p+'R',r+1, c, maze, newN);
        }
        if (c < maze[0].length -1){
             newN = restriction(p+'D',r, c+1, maze, newN);
        }
        return newN;
    }
}
