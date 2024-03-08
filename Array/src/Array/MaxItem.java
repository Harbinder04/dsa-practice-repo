package Array;

import java.util.Arrays;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {110, 2, 9, 23, 12,60};
//        System.out.println(max(arr));
          reverse(arr);
          System.out.println(Arrays.toString(arr));
//        System.out.println(maxRange(arr, 2, 6));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static int maxRange(int[] arr, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        if(end> start){
            return -1;
        }
        int max = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
    //imagine that arr is not empty
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]> max){
               max = arr[i];
           }
        }
        return max;
    }
}