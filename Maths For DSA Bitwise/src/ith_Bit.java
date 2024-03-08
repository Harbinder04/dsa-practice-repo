public class ith_Bit {
        public static void main(String[] args) {
            int n = 182;
            System.out.println(Integer.toBinaryString(n));
            int j = 3;
            int mask = 1 << j;
            if ((n & mask )== 0){
                System.out.println("off");
            }else {
                System.out.println("on");
            }
        }
}
