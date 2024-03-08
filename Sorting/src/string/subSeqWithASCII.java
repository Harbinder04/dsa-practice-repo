package string;

import java.util.ArrayList;
import java.util.Arrays;

public class subSeqWithASCII {
    public static void main(String[] args) {
        subSeqWithASCII("", "ab");
    }

    static void subSeqWithASCII(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeqWithASCII(p + (ch + 0), up.substring(1));
        subSeqWithASCII(p + ch, up.substring(1));
        subSeqWithASCII(p, up.substring(1));
    }

    static ArrayList<String> subSeqWithASCIIArray(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subSeqWithASCIIArray(p + (ch + 0), up.substring(1));
        ArrayList<String> second = subSeqWithASCIIArray(p + ch, up.substring(1));
        ArrayList<String> third = subSeqWithASCIIArray(p, up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
