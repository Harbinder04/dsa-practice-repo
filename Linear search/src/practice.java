import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 7, 8};
    int l = arr.length;
    int temp;
    int n = Math.floorDiv(l, 2);
    for (int i = 0 ; i < n ; i++){
         temp = arr[i];
         arr[i] = arr[l-1-i];
        arr[l-1-i] = temp;
    }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
