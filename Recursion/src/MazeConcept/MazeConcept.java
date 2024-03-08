package MazeConcept;

import java.util.ArrayList;

public class MazeConcept {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//         direction("", 3,3);
        System.out.println(pathArr("", 3, 3));
    }
    static int count(int r, int c){
        if(r == 1 || c == 1){ // just reach at the last box of the maze. (1,1)

//             because if you reach at the end col or row
//            there is only one possible way to go ahead
//            that means you find the possible 1 answer.
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }
    static void direction(String p, int r, int c){  // p is processed.
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if (r > 1) {
            direction(p + 'D', r - 1, c);
        }
        if(c > 1){
            direction(p + 'R', r, c-1);
        }
    }

    //Returning all the answer in the arrayList
    static  ArrayList<String> pathArr(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1){
            list.addAll(pathArr(p + 'D', r-1, c));
        }
        if (c > 1){
            list.addAll(pathArr(p + 'R', r, c-1));
        }
        return list;
    }
}
