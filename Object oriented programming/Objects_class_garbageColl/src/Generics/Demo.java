package Generics;


import javax.print.DocFlavor;

public class Demo<T> {  // T stands for type, remove t if you not want to make it generic.
//    private Object object;
//    public Object get(){
//        return object;
//    }
//    public void set(Object object){
//        this.object = object;
//    }
private T t;
    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }

    public static void main(String[] args) {
//        Demo boxNumber = new Demo();  // suppose Here box need to be of Integer type only, but you can pass anything
//                                     // because it is not generic.
//        boxNumber.set("One");
//        System.out.println(boxNumber.get());

        Demo<Integer> box2  = new Demo<>();
        Demo rawBox = box2; // raw type of demo class may assign a parameterized type to its raw type is allowed.
        box2.set(2);
        System.out.println(box2.get());
//        rawBox.set("Hello");   // Avoid this raw type. 
//        System.out.println(rawBox.get());
    }
}
