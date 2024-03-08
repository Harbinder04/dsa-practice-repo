package AbstractClasses;
 public abstract class Parent {
     final int age;
     // Can we create a constructor of an abstract class
     public Parent(){  // can have default constructor
         this.age = 10;
         System.out.println("default "+ age);
     }

     public Parent(int age){  // can have parameterized constructor but to implement need to be overridden in subclasses.
         System.out.println("parameterized constructor"+ age);
         this.age = 40;  // when this is called age value is 40.
     }
     static void hello(){ // can create simple methods.
         System.out.println("Hii");
     }
    abstract void career();
    abstract void stream();
}
