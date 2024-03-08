public class hcf_Lcm {
    public static void main(String[] args) {
        System.out.println(gcd(3,9));
        System.out.println(lcm(10,5));
    }
    static int gcd(int a, int b){
        if(a== 0){
            return b;
        }
        return gcd(b%a, a);
    }
    static int lcm(int a, int b){
        return a*b / gcd(a, b);
    }
}
