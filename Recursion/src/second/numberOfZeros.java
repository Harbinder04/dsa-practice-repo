package second;

public class numberOfZeros {
    public static void main(String[] args) {
        zeros(400242000);
        System.out.println(count);
    }
    static int count = 0;
    static int zeros(int n){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        if(rem == 0){
            count++;
        }
        return zeros(n/10);
    }
}
