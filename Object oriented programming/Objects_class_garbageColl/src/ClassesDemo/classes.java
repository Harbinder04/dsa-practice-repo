package ClassesDemo;

import java.util.Arrays;

public class classes {
    static class Student{
        int roll;
        String name;
        float cgpa;
        void greeting(){
            System.out.println("Hello! My name is:"+ this.name);  // first constructor is called then this is called.
        }
        // constructor
        Student(){
            this.roll = 13;
            this.name = "Harbinder singh";
            this.cgpa = 89.0f;
        }

        // constructor of student class with arguments.

//         Student(int roll, String name, float cgpa){
//             System.out.println(roll);
//             System.out.println(name);
//             System.out.println(cgpa);
//         }
        //2nd way:
        Student(int roll, String name, float cgpa){
            this.roll = roll;
            this.name = name;
            this.cgpa = cgpa;
        }
    }
    public static void main(String[] args) {
//        Student harbi = new Student(23, "Harbinder singh", 89.0f); // Calling constructor.

//        Student[] sud1 = new Student[5];  // new keyword dynamically allocate memory & return reference to variable.
//        System.out.println(Arrays.toString(sud1)); // this is null.

        Student harbinder = new Student(); // instantiating object
//        harbinder.cgpa = 98.0f;
//        harbinder.name = "Harbinder singh";
//        harbinder.roll = 23;
        System.out.println(harbinder.cgpa);
        System.out.println(harbinder.name );
        System.out.println(harbinder.roll);

        harbinder.greeting();

        Student rohan = new Student(12, "Rohan", 78.0f);
        System.out.println(rohan.cgpa);
        System.out.println(rohan.name );
        System.out.println(rohan.roll);

    }
}
