package ArraysQuestion;

import java.util.ArrayList;

public class returnAllTarget {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 6};
        int target = 6;
//        System.out.println(checkIndexes(arr, target, 0));

        ArrayList<Integer> ans = findIndexes(arr, target, 0, new ArrayList<>());
        System.out.println(ans);

    }
//    static ArrayList<Integer> list = new ArrayList<>();  // globally declared.
//    static ArrayList<Integer> checkIndexes(int[] arr, int target, int index){
//        if(index == arr.length){
//            return list;
//        }
//        if(arr[index] == target){
//            list.add(index);
//            checkIndexes(arr, target, index + 1);
//            return list;
//        }
//        return checkIndexes(arr, target, index + 1);
//    }

    //What if we want to return ArrayList with example.
    static ArrayList<Integer> findIndexes(int[] arr, int target, int index, ArrayList<Integer> result){
        if(index == arr.length){
            return result;
        }
        if(arr[index] == target){
            result.add(index);
        }
        return findIndexes(arr, target, index+1 , result);
    }
}
