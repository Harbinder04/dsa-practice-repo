public class primeNumber {
    public static void main(String[] args) {
        int n = 23;
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
       int c =  2;
        while (c*c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
