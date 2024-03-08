package ClassesDemo;

public class constructorCallConstructor {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println(stu1.name);
    }
    static class Student {
        int roll;
        String name;
        float cgpa;

        Student() {
            // this is how you can call constructor from another constructor.
            // here this is going to replace with Student itself.
            this (13, "default person", 100.0f);
        }
        Student(int roll, String name, float cgpa) {
            this.roll = 13;
            this.name = "Harbinder singh";
            this.cgpa = 89.0f;
        }
    }
}
