package second;

public class product_of_digit {
    public static void main(String[] args) {
        System.out.println(product(2131));
    }
    static int product(int n){
     if(n%10 == n){
         return n;
     }
//     recursive call
     return n%10 * product(n/10);
    }
}
