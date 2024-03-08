import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n;
        System.out.print("is given no. is the power of 2 : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean ans  = ((n & (n - 1)) == 0) && (n != 0);
        System.out.println(ans);
    }
}
