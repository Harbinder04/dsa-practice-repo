public class rightMostSetBit {
    public static void main(String[] args) {
        // Program to find the right most set bit of the number. 
        int n = 94;
        String str1 = Integer.toBinaryString(n);
        int result = n & (-n);
        System.out.println(str1);
        System.out.println(result);
    }
}
