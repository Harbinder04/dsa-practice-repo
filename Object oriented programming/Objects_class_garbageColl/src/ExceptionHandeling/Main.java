package ExceptionHandeling;

import java.nio.channels.AcceptPendingException;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            System.out.println(divide(a, b));
//            int ans = a / b;
            String name = "Singh";
                if (name.equals("Singh")) {
                    throw new MyException("Custom exception occurred.");
                }
            } catch (MyException e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException e){    // strict exception have to call first.
            System.out.println(e.getMessage());
        } catch (Exception e){  // Exception is the main class, so it need to be declared in below of all the sub exception classes.
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I am finally so I will execute every time the program is running.");
        }
    }
    static int divide(int a, int b) throws AcceptPendingException {
        if(b == 0){
            throw new ArithmeticException("number cannot be divisible by 0"); // When you want to explicitly throw something you can throw
                                                                             // by this method.
        }
        return a/b;
    }
}
