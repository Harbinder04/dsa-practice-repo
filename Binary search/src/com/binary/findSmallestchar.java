package com.binary;

import java.util.Arrays;

/*Find the smallest Letter Greater than target*/
public class findSmallestchar {
    static char graterLetter(char[] letter, char target){
        int start = 0 ;
        int end = letter.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;  // so that value of end + start not exceed the limit of int.
            if(target < letter[mid]){
                end = mid - 1;
            } else {
                start = mid +1;
            }
        }
        return letter[start%letter.length];
    }
    public static void main(String[] args) {
        char[] letter =  {'c', 'f', 'j'};
        char target = 'j';
        char ans =  graterLetter(letter, target);
        System.out.println(ans);
    }
}
