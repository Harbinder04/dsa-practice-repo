public class patterns25_30 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern29(int n){
        int rows = n;
        // Printing the upper half of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (rows - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Printing the lower half of the pattern
        for (int i = rows-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (rows - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern28(int rows){
//       kite: just make right triangle and the rest is designing part
        for(int i = 0; i < rows; i++){
            for (int col = 0; col <= rows; col++){
                if(col >= rows-i){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < rows; i++){   // start from 1 in GFG question
            for (int j = 0; j <= rows; j++){
                if (j <= i){
                    System.out.print(" ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
