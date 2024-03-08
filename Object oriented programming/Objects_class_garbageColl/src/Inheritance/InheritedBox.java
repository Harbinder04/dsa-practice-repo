package Inheritance;

public class InheritedBox extends box {
    double weight;
    public InheritedBox (){
        this.weight = -1;
    }
    InheritedBox(double weight){
        this.weight = weight;
    }
    InheritedBox( InheritedBox other){
        super(other);  // Same thing as this ->  "box box5  = new InheritedBox();"
        weight = other.weight;
    }
    public InheritedBox(double l, double h, double w, double weight){

//        super(l, h, w); // What is this? Call the parent class constructor which takes 3 argument.
        //  Used to initialise value present in parent class.
//        super.h = h;
        this.h = h;
        /* Giving the h in the above class
        * suppose if there is weight in base class how you will access that - using super keyword.
        * 2. If super is not used in subclass constructor then default constructor of base class will run.
        *
        * */
//        this.h = h;
        this.weight = weight;
//        super(l, h, w);  // Give error :: don't mention super below because the child class has no idea of parent class.
    }
}
