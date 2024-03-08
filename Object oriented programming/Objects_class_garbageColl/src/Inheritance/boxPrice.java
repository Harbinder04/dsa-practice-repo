package Inheritance;

public class boxPrice extends InheritedBox{
    double price;
    boxPrice(){
        this.price = -1;
    }

    boxPrice(double weight, double price){
        super(weight);
        this.price = price;
    }
    public boxPrice(double l, double h, double w, double weight, double price){
        super(l, h, w, weight);
        this.price = price;
//        System.out.println(weight);  // access able
    }
}
