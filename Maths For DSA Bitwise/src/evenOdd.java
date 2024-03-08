public class evenOdd {
    public static void main(String[] args) {
        int n = 1;
        System.out.print("Is n is odd: "+ check(n));
    }

    private static boolean check(int n) {
        if((n&1) == 1 ){
            return true;
        }
        return false;
    }
}
