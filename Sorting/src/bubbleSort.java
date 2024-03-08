import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
//        int[] arr ={1, 2, 3, 4, 5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the step to rerun up-to n-1
        for(int i = 0; i<= arr.length-1; i++){
            swapped = false;
            //for each step, max item will come at the last respective index.
            for(int j = 1; j < arr.length-i; j++){ // arr.length is for eliminating the last index as it is sorted in every pass. 
                if(arr[j]< arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped =true;
                }
            }
            //if not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped) {
                break;
            }
        }
    }
}
