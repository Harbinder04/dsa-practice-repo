package SortByRecursion;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
//        int[] arr ={1, 2, 3, 4, 5};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString (arr));
    }
    static void bubble(int[] arr, int r, int c){
        if( r ==0){
            return;
        }//with every pass my arr is at correct position.
        if(r > c){
            if(arr[c] > arr[c+1]) {
                //swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, r, c+1);
        }else{
            bubble(arr, r-1, 0);
        }
    }
}
