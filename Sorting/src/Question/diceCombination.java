package Question;

import java.util.ArrayList;
import java.util.List;

public class diceCombination {
    public static void main(String[] args) {
        System.out.println("Number of possible combination are: ");
//        combination("", 2);
        System.out.println(combinationArray("", 4));
    }
    static void combination(String p, int target){
        if (target == 0){
            System.out.print(p+", ");
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++){
            combination(p+ i, target-i);
        }
    }
    static ArrayList<String> combinationArray(String p, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++){
            list.addAll(combinationArray(p+ i, target-i));
        }
        return list;
    }
}
