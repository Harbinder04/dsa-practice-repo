import java.util.Arrays;

public class sortedMatrix {
    public static void main(String[] args) {
//    int[][] arr = {{1, 2, 3}}; // for 1d array example.
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(Arrays.toString(search(arr, 3)));
    }
    //Search in the row  provided between the col provided.
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart<= cEnd){
            int mid = cStart + (cEnd -cStart )/2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid]< target){
                cStart = mid + 1;
            }else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] arr, int target){
        int rows = arr.length;
        int col = arr[0].length;

        if(rows == 1){     //Only apply when we have only 1d array.
            return binarySearch(arr, 0, 0,col-1,target);
        }
        int rStart = 0;
        int rEnd = rows -1;
        int cMid = col /2;
        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart)/2;
            if (arr[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if(arr[mid][cMid]< target){
                rStart = mid;
            }else {
                rEnd = mid;
            }
        }
        // Now we left with two rows only.
        if(arr[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(arr[rStart+1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }
        //search in 1 half
        if (target <= arr[rStart][cMid - 1]){
            return binarySearch(arr, rStart, 0,cMid -1,target);
        }
        //search in 2 half
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][col - 1]){
            return binarySearch(arr, rStart, cMid + 1,col - 1,target);
        }
        //search in 3 half
        if (target <= arr[rStart + 1][cMid - 1]){
            return binarySearch(arr, rStart + 1, 0, cMid -1, target);
        }
        //search in 4 half
        else{    //(target >= arr[rStart + 1][cMid + 1])
            return binarySearch(arr, rStart + 1, cMid + 1, col - 1, target);
        }
    }
}
