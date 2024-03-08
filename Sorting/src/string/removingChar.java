package string;

public class removingChar {
    public static void main(String[] args) {
        String a = "aman";
        String b = "";
        skip(b,a);
//        System.out.print(b);
//        System.out.println(editor(a));
//        System.out.println(editAWord("something"));
    }
    static void skip(String p,String up){// here p is processed string and up is unprocessed string.
    if(up.length() == 0){  // or you can use up.empty function
        System.out.println(p);
        return;
    }
    char ch  = up.charAt(0);
    if(ch == 'a'){
        skip(p, up.substring(1));
    }else {
        skip(p+ch, up.substring(1));
    }
    }

    //Second way
    static String editor(String s){ // removing a without passing it in the argument.
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if (ch == 'a'){
            return editor(s.substring(1));
        }
        return ch + editor(s.substring(1));
    }
    static String editAWord(String s){
        if(s.isEmpty()){
            return "";
        }
        if (s.startsWith("some")){
            return editAWord(s.substring(4));
        }
        return s.charAt(0) + editAWord(s.substring(1));
    }
    static String editSoNotSome(String s){
        if(s.isEmpty()){
            return "";
        }
        if (s.startsWith("so") && !s.startsWith("some")){
            return editSoNotSome(s.substring(2));
        }
        return s.charAt(0) + editSoNotSome(s.substring(1));
    }

}
