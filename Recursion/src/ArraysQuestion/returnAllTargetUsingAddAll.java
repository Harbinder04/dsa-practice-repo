package ArraysQuestion;

import java.util.ArrayList;

public class returnAllTargetUsingAddAll {
    public static void main(String[] args) {
        int[] arr = {1,3, 4, 4, 2};
        int target = 4;
        ArrayList<Integer> list = findIndex(arr, target, 0);
        System.out.println(list);

    }
    static ArrayList<Integer> findIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansofAllList = findIndex(arr, target, index+1);
        list.addAll(ansofAllList);  // addAll function
        return list;
    }
}
