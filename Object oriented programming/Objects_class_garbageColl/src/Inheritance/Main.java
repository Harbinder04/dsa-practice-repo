package Inheritance;

public class Main {
    public static void main(String[] args) {
        // Any object will not access the private variables of other file.
//        box b1 = new box(4.2, 5.6, 6.7); // calls function with 3 argument.
//        box b2 = new box(b1); // copy constructor.
//        System.out.println(b2.l + " ," + b2.w + " ," + b2.h);
//        System.out.println(b1.l + " ," + b1.w + " ," + b1.h);
//        // showing inheritance
//        InheritedBox Ib1 = new InheritedBox(34); // but now here if we want to give arguments for previous
//        // class.
//        InheritedBox box4 = new InheritedBox(4.2, 5.6, 6.7, 12);
//        System.out.println(box4.h + " " + box4.weight);
//
//        box box5  = new InheritedBox(2, 3, 5, 12);
//        System.out.println(box5.w); // You can only access the function or variable of super class.
        InheritedBox box6 = new boxPrice(3.2, 4.5, 5, 10, 45);
        System.out.println(box6.h);
        System.out.println(box6.weight);
//        System.out.println(box6.weight);
//        System.out.println(box6.price); // -> not accessed

    }
}
