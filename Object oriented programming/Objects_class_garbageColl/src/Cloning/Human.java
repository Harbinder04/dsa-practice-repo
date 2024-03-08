package Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 4, 5};
    }

    public Human(Human other){ // not required if using cloneable.
        this.age = other.age;
        this.name = other.name;
    }

//    public Object clone() throws  CloneNotSupportedException{
//        return super.clone();  // shallow copy.
//    }

    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human) super.clone();// this is actually shallow copy.
        // make deep copy.
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
