package SortByRecursion;
import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {20, 33, 10, 4, 5};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int l, int h){
        if(l >= h){
            return;
        }
        int s = l;
        int e = h;
        int m = s + (e - s)/2;
        int pivot = arr[m]; // because it gives us good complexity O(NLogN).
        while (s <= e){
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
         if (s <= e){
             int temp = arr[s];
             arr[s] = arr[e];
             arr[e] = temp;
             s++;
             e--;
         }
        }
        // now my pivot is at correct index, please sort two halves now.
        sort(arr, l, e);
        sort(arr, s, h);
    }

}
