package com.binary;

import java.util.Arrays;

public class firstAndLastPosition {
//    You have to give an answer that where the first and last time the target is present in array e.g. [1,2,2,3,2,6]  target is 2
//    then you return the index number [1, 4] and if element is not present return [-1, -1].
    static int[] findAns(int[] arr, int target){
            int[] ans = {-1, -1};

            //check for the first occurrence of target
        ans[0] = search(arr, target, true );
        if(ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        return ans;
        }
        // this function just return the index value of target.
        static int search(int[] arr, int target, boolean findIndex){
        int ans = -1;
        int start = 0 ;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;  // so that value of end + start not exceed the limit of int.
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else{
                // potential answer is found
                ans = mid;
                if(findIndex){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//         int[] arr = {1,2 ,3, 2, 4, 2, 2, 5};
        int[] arr = {};
         int target = 2 ;
         int[] ans =  findAns(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
