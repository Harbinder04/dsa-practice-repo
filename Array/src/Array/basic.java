package Array;

import java.util.Arrays;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of array : ");
        size = sc.nextInt();
//        int[] arr = new int[size] ;
        String[] sarr = new String[size] ;
        System.out.print("enter array element: ");

        // for loop in array
//        for(int i = 0 ; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
////        method by java
//        System.out.println(Arrays.toString(arr));
        // For each loop
//        for ( int num : arr){
//            System.out.print(num+" ");  //Here num represents element of array.
//        }

        // Example of string array
        // for loop in array
        for(int i = 0 ; i < sarr.length; i++){
            sarr[i] = sc.next();
        }
//        method by java
        System.out.println(Arrays.toString(sarr));
    }
}
