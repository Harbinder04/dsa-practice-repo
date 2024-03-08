package Inheritance;

public class box {
    double l;
    double w;
    double h;
    double weight;  //--> showing super keyword use-case.
    box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    box(float side){
        super(); // not giving error :: Every class has Object as a superclass.

        this.h = side;
        this.l = side;
        this.w = side;
    }

    box(double h, double l, double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    box(box old){
        this.h = old.l;
        this.w = old.w;
        this.l = old.l;
    }
}