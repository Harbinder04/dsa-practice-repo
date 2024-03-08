package com.binary;
/*Here we are assuming that we have given with ascending  order array*/
public class binarySearch {

    public static void main(String[] args) {
        int[] arr = {-23, -4, -2, 2, 3, 4, 15, 16, 45,65};
        int target = -24;
        int ans = binarySearch(arr, target);
//        System.out.println(ans);
        if(ans == -1 ){
            System.out.println("The target value not found");
        }else{
            System.out.println("The target value is present in array at index = "+ ans);
        }
    }
    //return the index
    static int binarySearch(int[] arr, int target){
        int start = 0 ;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;  // so that value of end + start not exceed the limit of int.
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else{
                return mid;  // if we get the middle element is equal to the target then that is answer.
            }
        }
        return -1;
    }
}
