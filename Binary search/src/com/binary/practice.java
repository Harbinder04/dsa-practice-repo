package com.binary;

import java.util.Arrays;
import java.util.Scanner;


public class practice {
    public static int searchRange(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[mid] > arr[s]) {
                if (target < arr[mid] && target >= arr[s]) {
                    e = mid - 1;
                }
                if (target < arr[mid] && target <= arr[s]) {
                    s = mid + 1;
                }
            }
                if (target > arr[mid] && arr[s] <= target) {
                    e = mid - 1;
                }
                if (target < arr[mid] && arr[s] > target) {
                    s = mid + 1;
                }
            else{
                if(target < arr[mid]){
                    e = mid -1 ;
                }else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = searchRange(arr, 0);
        System.out.println((ans));
    }
}
