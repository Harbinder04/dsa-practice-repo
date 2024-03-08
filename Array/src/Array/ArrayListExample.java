package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);  // Pass the raper class in arraylist
//        list.add(56);
//        list.add(40);
//        list.add(34);
//        list.add(78);
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.contains(34));
//        list.set(2,56);
//        System.out.println(list);

        //taking input
        for(int i = 0; i< 5; i++){
            list.add(sc.nextInt());
        }
        //Output :
        for(int i = 0 ; i<5 ; i++){
            System.out.println(list.get(i)); // Pass index here, list[index] syntax will now work here
        }
        System.out.println(list);
    }
}
