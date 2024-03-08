import java.util.*;
class practice {
    public static void main(String[] args) {
        System.out.println(minMovesToCaptureTheQueen(1, 8, 7, 1, 7, 1));
    }

    public static int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if (a == e && !(a == c && d > Math.min(b, f) && d < Math.max(b, f)))
            return 1;  //for rook in same row and check whether it is not comming in between.
        if (b == f && !(b == d && c > Math.min(a, e) && c < Math.max(a, e)))
            return 1; // if the rook is in same column and check for the obstacle in the same column
        if (c + d == e + f && !(c + d == a + b && a > Math.min(c, e) && a < Math.max(c, e))) return 1;
        //
        if (c - d == e - f && !(c - d == a - b && a > Math.min(c, e) && a < Math.max(c, e))) return 1;
        return 2;
    }
}

