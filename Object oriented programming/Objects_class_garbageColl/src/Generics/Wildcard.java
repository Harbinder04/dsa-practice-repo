package Generics;

import java.util.*;

public class Wildcard {
    public static void printList(List<?> list) {  //
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }
    public static void process(List<? extends Number> list) {  // upper bound using extend keyword.
        for(Object elem : list){
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);
        process(li);
    }
}