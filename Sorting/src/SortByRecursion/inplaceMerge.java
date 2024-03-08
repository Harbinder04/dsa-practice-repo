package SortByRecursion;
import java.util.Arrays;

public class inplaceMerge {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        mergeInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeInPlace(int[] arr, int start, int end) {
        if (start == end - 1) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeInPlace(arr, start, mid);
        mergeInPlace(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from the first half
        while (i < mid) {
            merged[k] = arr[i];
            i++;
            k++;
        }

        // Copy the remaining elements from the second half
        while (j < end) {
            merged[k] = arr[j];
            j++;
            k++;
        }

        // Copy the merged array back to the original array
        for (int l = 0; l < merged.length; l++) {
            arr[start + l] = merged[l];
        }
    }
}
