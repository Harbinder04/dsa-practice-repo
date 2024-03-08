package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human hu = new Human(45, "Harbinder");
//        Human clone =,new  Human(hu);  //takes more time, so we use cloneable method.

        Human clone  = (Human)hu.clone();
        System.out.println(clone.age + " " + clone.name);
        System.out.println(Arrays.toString(clone.arr));

        clone.arr[0] = 10;
        System.out.println(Arrays.toString(hu.arr));// deep copy the array will not change but if there is shallow copy the array will change.

    }
}
