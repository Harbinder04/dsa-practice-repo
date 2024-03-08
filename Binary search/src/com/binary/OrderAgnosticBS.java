package com.binary;
/*Here we are assuming that we have given with ascending or descending  order array.*/
public class OrderAgnosticBS {
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
            } else {     // If the arr is in descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
//        return start;  // for ceiling
//        return end ; // for floor
        return -1 ;
    }
    public static void main(String[] args) {
//        int[] arr = {-23, -4, -2, 2, 3, 4, 15, 16, 45,65};
        int[] arr = { 65, 45, 16, 15, 4, 3, 2, -2};
        int target = 16;
        int ans = orderAgnosticBS( arr, target);
//        System.out.println("Your ceiling number is "+arr[ans] +" at index number is : "+ans);
        System.out.println(ans);
    }
}
