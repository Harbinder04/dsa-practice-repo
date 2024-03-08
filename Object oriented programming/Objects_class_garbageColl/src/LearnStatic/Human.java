package LearnStatic;

public class Human {
       int age;
       String name;
       int salary;
       boolean married;
//       long population; // this is not static it is created new for every object.
       static long population; // the property which is same for all the objects of this class.

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population += 1;
    }
}
