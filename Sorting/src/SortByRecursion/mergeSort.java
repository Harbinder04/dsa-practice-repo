package SortByRecursion;
import java.util.Arrays;
public class mergeSort {
    public static void main(String[] args) {
    int[] arr = {1, 3, 4, 6, 2};
    int[] ans = merge(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] merge(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        // copyOfRange is used to create a new object of the particular range of the array.
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid)); // using mid rather than of mid-1 because we have to give inclusive in copyOfRange method.
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));//using mid rather than of mid+1 because we have to give inclusive in copyOfRange method.

        return mergeTwo(left, right);
    }

    private static int[] mergeTwo(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0 ;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // if the length of the array is not same then we can place rest of the array in the end of mix.
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
