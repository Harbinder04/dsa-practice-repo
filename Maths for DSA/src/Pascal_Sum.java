public class Pascal_Sum {
    public static void main(String[] args) {
    int rowNumber = 3; // Specify the desired row number

    int sum = calculateSumOfRow(rowNumber);

        System.out.println("Sum of row " + rowNumber + ": " + sum);
}
    public static int calculateSumOfRow(int rowNumber) {
        // Calculate the value using bit shifting
        int sum = 1 << (rowNumber - 1);  // -1 is there to match the indexing of the row we want because it starts from 0 in pascal's triangle.
        return sum;
    }
}
