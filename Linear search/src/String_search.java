import java.util.Arrays;

public class String_search {
    static boolean search(String str, char target){
        if(str.length() == 0){   //length() has () because it is a function in string class.
            return false;
        }
        for(int index = 0; index< str.length();index++){
            if(target == str.charAt(index)) {
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str, char target){
        if(str.length() == 0){   //length() has () because it is a function in string class.
            return false;
        }
        for(char a : str.toCharArray()) //toCharArray is just creating the whole string into array of character.
            if (a == target) {
                return true;
            }
        return false;
    }
    public static void main(String[] args) {
        String str =  "Hanu";
        char target = 'u';
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(search2(str, target));
    }
}
