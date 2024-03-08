public class pattern17_25 {
    public static void main(String[] args) {
        pattern17(4);
    }
    static void pattern17(int n) {

        int maxLength = 2 * n - 1; // maximum length of each row

        for (int row = 1; row <= maxLength; row++) {
            int num;

            if (row <= n) {
                num = row;
            } else {
                num = 2 * n - row;
            }

            int spaces = maxLength - num;

            // Printing spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // Printing numbers in ascending order
            for (int k = num; k >= 1; k--) {
                System.out.print(k + " ");
            }

            // Printing numbers in descending order
            for (int l = 2; l <= num; l++) {
                System.out.print(l + " ");
            }

            System.out.println();
        }
    }
}
