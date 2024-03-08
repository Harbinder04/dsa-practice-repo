package com.binary;
// find the target element in the mountain array.
public class bitonicArray {
    static int search (int[] arr, int target){
        int peak = peakAns(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1 ){
            return firstTry;
        }
        // Try to search in second half .
        return orderAgnosticBS(arr, target, peak +1, arr.length-1);
        }
    static int orderAgnosticBS(int[] arr, int target, int start, int end){

        //Find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;  // this formula is used so that value of end + start not exceed the limit of int.

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{     // If the arr is in descending order
                if(target > arr[mid]){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return end;
    }
    static int peakAns(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid]> arr[mid]+ 1){
                //We are in the dec. part.
                //this may be the ans, be look at left
                // this is why end != mid-1
                end = mid ;
            }else {
                // acc. part
                start = mid + 1; // because we know that mid -1 element > mid-element . Hence, we are ignoring the mid element.
            }
        }
        /*In the end start == end and pointing to the largest number because of the 2 checks above.
         * start and end always trying to find the maximum value at every time loop will run. */
        return start; // or you can also return the end as they both are equal at end.
    }
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 3, 1};
    int target = 3;
    int ans = search(arr, target);
        System.out.println(ans);
    }
}
