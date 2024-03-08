import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class repeatedNumber {
    public static void main(String[] args) {
       int[] arr  = {1, 2, 3, 4, 5, 2, 4, 6};
      List<Integer> ans = duplicate(arr);
        System.out.println(ans);
    }
    static List<Integer> duplicate(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index< arr.length ; index++){
            if(arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
