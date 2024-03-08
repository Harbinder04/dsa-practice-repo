import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice {
    public static void main(String[] args) {
      List<List<String>> str = solveNQueens(4);
        System.out.println(str);
    }
    public static List<List<String>> solveNQueens(int n){
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append('.');
            }
            board.add(sb.toString());
        }
        solve(0, board, ans, n);
        return ans;
    }

    public static void solve(int row, List<String> board, List<List<String>> ans, int n){
        if (row == n){
            ans.add(new ArrayList<>(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(col, 'Q');
                board.set(row, sb.toString());
                solve(row + 1, board, ans, n);
                sb.setCharAt(col, '.');
                board.set(row, sb.toString());
        }
        }
    }

    public static boolean isSafe(int row, int col, List<String> board, int n) {
        for (int i = 0; i < row; i++){
                if (board.get(i).charAt(col) == 'Q') {
                    return false;
                }
        }
        // diagonal left
        int maxleft = Math.min(row, col);
        for (int i = 1; i <= maxleft; i++){
                if (board.get(row-i).charAt(col-i) == 'Q') {
                    return false;
                }
        }
        // diagonal right
        int maxright = Math.min(row, n-col-1);
        for (int i = 1; i <= maxright; i++){
                if (board.get(row-i).charAt(col+i) == 'Q') {
                    return false;
                }
        }
        return true;
    }
}





