import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2d {
    static int[] search(int[][] arr, int target){
        for(int row = 0 ; row < arr[row].length; row++){
            for (int col = 0; col < arr[col].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int maxIn2D(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] a : arr){
            for (int b : a ){
                if( b>max){
                    max= b;
                }
            }
        }
        return max ;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3},
                       {3,4},
                       {4,6}};
        int target = 4;
        int[] ans = search(arr, target);
        System.out.println("[row], [col] is: "+Arrays.toString(ans));
        int ans1 = maxIn2D(arr);
        System.out.println("Max value in array is : " + ans1);
    }
}
