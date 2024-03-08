package ArraysSubSet;

import java.util.ArrayList;
import java.util.List;

public class iterativeSubSet {
    public static void main(String[] args) {
   int[] arr = {1, 2, 3};
//        List<List<Integer>> ans = subSetDuplicate(arr);
//        for (List<Integer> list : ans){
//            System.out.print(list+" ");
        System.out.println(subSet(arr));
        }
    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // adding empty list
        for (int num : arr){
            int n = outer.size();   // size for the internal loop.
            for(int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i)); // Internal list:: outer.get(i)- makes a copy of the existing list and add num to it.
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subSetDuplicate(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s = 0 ;
        int e = 0;
        for (int i = 0; i < arr.length; i++){
        s = 0; // so that it always start from the 0 until it is duplicate.
        if(i > 0 && arr[i] == arr[i - 1]) {  //executed if the element at index is duplicate.
        s = e+ 1;
        }
        e = outer.size() - 1;
        int n = outer.size();
        for (int j = s; j < n; j++){
            List<Integer> internal = new ArrayList<>(outer.get(j));
            internal.add(arr[i]);
            outer.add(internal);
        }
        }
        return outer;
    }
}

