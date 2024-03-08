import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int start , int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;
    }
}
