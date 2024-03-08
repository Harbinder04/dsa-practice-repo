public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.printf("%.3f",sqrt(40)); //Pretty printing.
    }
    static double sqrt(double n){
        double x = n;
        double root;
        while (true){
            root = 0.5 * (x +(n/x));
            if (Math.abs(root-x) < 0.8){ // as the value will reduce the precision increases but the number of steps increases.
                break;
            }
            x = root;
        }
        return root;
    }
}
