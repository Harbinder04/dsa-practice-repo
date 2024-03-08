package com.binary;

public class InfiniteArray {
    public static void main(String[] args) {
        // start with the box of size
        int[] arr = {3, 5,7 ,9, 10,40,50,56,67};
        int target = 56 ;
        int ans = range(arr, target);
        System.out.println(ans);
    }
    static int range(int[] arr, int target){
        //First we have to find the range.
        //First start with an arr[0] and arr[1].
        int start = 0;
        int end = 1;

        // Condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;    // start become end+1 in every search become
            end = end + ((end - start) + 1) * 2; // end double after each search
//            if(start <= end) {
//                return binarySearch(arr, target, start, end);
//            }
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start , int end){
        while(start<= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
