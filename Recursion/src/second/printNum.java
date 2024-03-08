package second;

public class printNum {
    public static void main(String[] args) {
//        printNo(5);
          printBoth(5);
    }

    static void printNo(int n){
        if(n < 1){
            return;
        }
        System.out.println(n);
        printNo(n-1);
    }
    static void printSeries(int n){
        if(n < 1){
            return;
        }
        printSeries(n-1);
        System.out.println(n);
    }
    static void printBoth(int n){
        if(n < 1){
            return;
        }
        System.out.println(n);
        printNo(n-1);
        printSeries(n-1);
        System.out.println(n);
    }
}
