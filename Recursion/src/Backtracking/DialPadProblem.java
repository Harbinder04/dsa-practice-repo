package Backtracking;

import java.util.ArrayList;

public class DialPadProblem {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static ArrayList<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();

        String[] dict = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        ArrayList<String> combos = new ArrayList<>();
        backtrack(combos, digits.toCharArray(), "", dict);
        return combos;
    }

    public static void backtrack(ArrayList<String> combos, char[] digits, String s, String[] dict) {
        if (s.length() == digits.length) {
            combos.add(s);
            return;
        }
        int i = s.length();
        int digit = digits[i] - '0';
        for (char letter : dict[digit].toCharArray()) {
            backtrack(combos, digits, s +letter, dict);
        }
    }
}
