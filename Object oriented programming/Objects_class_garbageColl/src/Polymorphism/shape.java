package Polymorphism;

public class shape {
    // Early binding.
// final void  area(){
//      System.out.println("I am in shape.");
//  }
    void  area(){  // can't use final here if we want to override it.
        System.out.println("I am in shape.");
    }
    void area(int n){
        System.out.println("I am in shape."+n);
    }
}