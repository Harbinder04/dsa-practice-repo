package LearnStatic;

public class StaticBlock {
    public static void main(String[] args) {
        UseStatic.meth(34);   // as soon as UseStatic class is loaded all the static statements are run.
    }
}
class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Static block initialized."); // only calls one's.
        b = a * 4;
    }
}
