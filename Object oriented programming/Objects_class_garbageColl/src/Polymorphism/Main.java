package Polymorphism;

public class Main {
    public static void main(String[] args) {
        shape shape = new circle(); // possible -> only access the methods of circle class but only if the base class has same method.
//        circle circle = new circle();
//        square square = new square();

//        circle.area(12);  // calling shapes constructor with argument. -> only access able if shape class has area method.
        shape.area();  // shows circle area because reference is of circle() class.
//        square.area();
    }
}
