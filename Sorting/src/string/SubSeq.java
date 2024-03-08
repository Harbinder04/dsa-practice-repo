package string;
import java.util.ArrayList;
import java.util.Arrays;

public class SubSeq { // subsequent is for string and subset is for arrays.
    public static void main(String[] args) {
//        System.out.println(subSeq("", "abc"));
        subSeq("", "abc");
        subSeqArg("", "abc", new ArrayList<>()); // conf: you don't have to specify arraylist type if you are passing array list in call.
        // to display the list we have to make a list out-side the function call .
    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){  // up.length() == 0
            System.out.print(p+", ");  // empty is also included if forgotten revise tree for clarity.
            return;
        }
        char  ch = up.charAt(0);
        subSeq(p+ch, up.substring(1)); // add char to processed i.e. p.
        subSeq(p, up.substring(1));
    }
    // By creating in the function return arraylist.
    static ArrayList<String> subSeqArr(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);  // empty is also included if forgotten revise tree for clarity.
            return list;
        }
        char  ch = up.charAt(0);
        ArrayList<String> left = subSeqArr(p+ch, up.substring(1));
        ArrayList<String> right = subSeqArr(p, up.substring(1));

        left.addAll(right);
        return left;
    }
    // by passing arraylist in argument
    static void subSeqArg(String p, String s, ArrayList<String > list){
        if (s.isEmpty()){
            list.add(p);
            return;
        }
        char ch = s.charAt(0);
        subSeqArg(p + ch, s.substring(1), list);
        subSeqArg(p, s.substring(1),list);
    }
}
