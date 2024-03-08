import java.util.Arrays;

public class Convert2DtoSingle {
    public static int[] convertToSingleMatrix(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[] singleMatrix = new int[numRows * numCols];

        int index = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                singleMatrix[index] = matrix[i][j];
                index++;
            }
        }

        return singleMatrix;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},};
        int[] ans =convertToSingleMatrix(arr);
        System.out.println(Arrays.toString(ans));
    }
}
