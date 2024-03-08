package Polymorphism;

public class circle extends shape{
//    @Override     // called annotation
    void area(){
        System.out.println("I am in circle area.");
    }
    void area(int n){
        System.out.println("I am in circle area ="+ n);
    }
}
