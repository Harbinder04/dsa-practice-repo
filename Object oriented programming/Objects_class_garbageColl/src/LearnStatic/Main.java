package LearnStatic;

import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {  // Why main is static?
        Human kunal = new Human(23, "Harish", 15000, true);
        Human rahul = new Human(21, "Rahul", 15000, false);

        System.out.println(kunal.married);
//        System.out.println(kunal.population); // population is different for both object because each object has its new instance variable population.
//        System.out.println(rahul.population);

        // If we use static.
        System.out.println(Human.population);// this is common for all human class objects.

        /* You can access static variable even if the object is not created.
        * One more point is there you can access the static variable with the help of object name but is not the good
        * practice even don't do this. */
    }
}
