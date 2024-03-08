package SortByRecursion;

import java.util.Arrays;

public class selectionSort {    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
//        int[] arr ={1, 2, 3, 4, 5};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString (arr));
    }
    static void selection(int[] arr, int r, int c, int max) {  // r stands for row
        if (r == 0) {
            return;
        }
        if (r > c) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r - 1, 0, 0);
        }
        }
}
