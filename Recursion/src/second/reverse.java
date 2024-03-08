package second;

public class reverse {
    static int rNum = 0;
//    Way 1:
    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        rNum = rNum * 10 + rem;
        rev1(n / 10);
    }
//    Way 2:
    static int rev2(int n){
          int digits = (int) (Math.log10(n) + 1);  //finding number of digits using formula.
          return helper(n, digits);
    }
    static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n % 10 ;
        return rem * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }
    static boolean isPalin(int n){
        return (n == rev2(n));
    }

        public static void main (String[]args){
            rev2(345);
//            System.out.println(rNum);
//          System.out.println(isPalin(3443));
        }
}
