import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class practice {
    public static void main(String[] args){

    }
    public List<List<String>> solveNQueens(int n) {
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

    public void solve(int col, List<String> board, List<List<String>> ans, int n) {
        if (col == n) {
            ans.add(new ArrayList<>(board));
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(col, 'Q');
                board.set(row, sb.toString());
                solve(col + 1, board, ans, n);
                sb.setCharAt(col, '.');
                board.set(row, sb.toString());
            }
        }
    }

    public boolean isSafe(int row, int col, List<String> board, int n) {
        for (int i = 0; i < col; i++) {
            if (board.get(row).charAt(i) == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        return true;
    }
}
