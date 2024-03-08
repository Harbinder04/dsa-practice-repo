package permutation;

import java.util.Scanner;

public class findPermutation {
    public static void main(String[] args) {
        //totalobjects=n, selectedobjects=r
        int totalobjects, selectedobject, permutation, f1, f2;
//creating a constructor of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n and r: ");
//reading the value of n
        totalobjects = sc.nextInt();
//reading the value of r
        selectedobject = sc.nextInt();
        f1 = totalobjects;
        for (int i = totalobjects - 1; i >= 1; i--)
        {
            f1 = f1 * i;
        }
        int number;
        number = totalobjects - selectedobject;
        f2 = number;
        for (int i = number - 1; i >= 1; i--)
        {
//determining the factorial
            f2 = f2 * i;
        }
        permutation = f1 / f2;
//prints the permutation
        System.out.println("The permutation of P(n, r) = "+permutation);
    }
}
