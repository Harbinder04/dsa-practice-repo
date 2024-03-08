public class pattern {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern31(5);
        paperPattern(5);
    }
    static void pattern16(int n){
//        Pascal's Triangle pattern
        for (int row = 0; row < n; row++) {
            int number = 1;

            // Add appropriate number of spaces before each row
            for (int col = n - row; col > 1; col--) {
                System.out.print("  ");
            }
            // Print numbers in the row
            for (int col = 0; col <= row; col++) {
                System.out.print(number + "   ");
                number = number * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }

   static void pattern15(int n){
       // Upper half of the kite
       for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n - i; j++) {
               System.out.print(" ");
           }
           for (int j = 1; j <= 2 * i - 1; j++) {
               if (j == 1 || j == 2 * i - 1) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
       // Lower half of the kite
       for (int i = n - 1; i >= 1; i--) {
           for (int j = 1; j <= n - i; j++) {
               System.out.print(" ");
           }
           for (int j = 1; j <= 2 * i - 1; j++) {
               if (j == 1 || j == 2 * i - 1) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
   }
    static void pattern13(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= 2*n-1; col++){
                if (col > n - row  && col <= n + row - 1) {
                    if (row == n || col == n - row + 1 || col == n + row - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for (int row = 0; row < n ; row++){
            for (int col = 0; col < n ; col++){
                if(col< row){
                    System.out.print(" ");
                }else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
        for (int row = 0; row < n ; row++){
            for (int col = 0; col < n ; col++){
                if(col< n-row-1){
                    System.out.print(" ");
                }else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

    }
    static void pattern11(int n){
        for (int row= 0; row< n; row++){
            for (int col = 0; col < n ; col++){
                if (col < row){
                    System.out.print(" ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void pattern10(int n) {
        for (int row = 0; row < n; row++){
            for (int col = 0 ; col < n ; col++){
                if(col < n-row-1){
                    System.out.print(" "); //only one space to form an exact pattern.
                }else {
                    System.out.print("* "); //space after star.
                }
            }
            System.out.println();
        }
    }
    static void pattern9(int n) {
      for (int row = 1; row <= n; row++){
          for(int col = 1 ; col < n*2; col++){
              if (row <= col && col <= n*2 - row){
                  System.out.print(" *");
              }else {
                  System.out.print("  ");
              }
          }
          System.out.println();
      }
    }
    static void pattern8(int n) {
        int doubleOfn = n * 2;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < doubleOfn; col++) {
                if (col >= n - row + 1 && col <= n + row - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n ; col++){
                if (col < row){
                    System.out.print("  ");
                }else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n ; col++) {
                if(col <= n - row){
                    System.out.print("  ");
                }else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
    static void paperPattern(int n){
        n = n*2 -1;
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                int atEveryIndex = Math.max(Math.max(col, n-col+1), Math.max(row,n-row+1));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    static void pattern32(int n){
        n = n * 2-1;
        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++){
                int atEveryIndex = Math.max(Math.abs(((n+1)/2) - row - 1), Math.abs(((n+1)/2) - col - 1)) + 1;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
   static void pattern31(int n){
        n = n * 2-1;
        for (int row = 0; row <= n; row++){
            for (int col = 0; col <= n; col++){
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n- row, n- col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
   }
    static void pattern2(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int r2 = 1; r2 <= n - 1; r2++) {
                for (int c = 1; c <= n - r2; c++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    static void pattern1(int n){
        for(int r = 1; r <= n; r++){
            for(int c = n; c > r -1; c--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
