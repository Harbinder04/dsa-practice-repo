package second;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sunOfn(5));
    }
    static int sunOfn(int n){
        if(n == 1){
            return 1;
        }
        return n + sunOfn(n-1);
    }
}
