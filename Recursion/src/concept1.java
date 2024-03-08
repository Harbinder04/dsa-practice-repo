public class concept1 {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if (n == 0){
            return ;
        }
        System.out.println(n);
        // Difference between --n and n--.
        fun(--n);   // first decrement and then pass.
//        fun(n--);   //Will not work :: because first passes the value and then decrement.
    }
}
