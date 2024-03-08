
package com.binary;
/*Here we are assuming that we have given with ascending  order array.*/
public class floor {
    static int ceiling(int[] arr, int target) {
        //greatest number smaller than or equal to target
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;  // so that value of end + start not exceed the limit of int.
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;   //returning the
    }

    public static void main(String[] args) {
        int[] arr = {-2, 3, 5, 9, 14, 16, 18};
        int target = 2;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
}
