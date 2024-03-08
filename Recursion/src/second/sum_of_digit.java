package second;
public class sum_of_digit {
    public static void main(String[] args) {
        System.out.println(sunDigit(1003));
    }
    static int sunDigit(int n){
        if (n == 0){  // remember :: n == 0
            return 0;
        }
        // Recursion logic.
        return n%10 + sunDigit(n/10);
    }
}
