package com.binary;

public class mountainpeak {
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid]> arr[mid+ 1]){
                //We are in the dec part.
                //this may be the ans, be look at left
                // this is why end != mid-1
                end = mid ;
            }else {
                // acc part
                start = mid + 1; // because we know that mid -1 element > mid-element . Hence, we are ignoring the mid element.
            }
        }
        /*In the end start == end and pointing to the largest number because of the 2 checks above.
        * start and end always trying to find the maximum value at every time loop will run. */
        return start; // or you can also return the end as they both are equal at end.
    }
    public static void main(String[] args) {

    }
}
