package Generics;

import Interfaces.NestedInterface.A;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;
    public Student(int rollNo, float marks){
        this.rollNo = rollNo;
        this.marks = marks;

    }

    // without compareTo you can not compare objects.
    @Override
    public int compareTo(Student o) {
      int diff = (int)(this.marks - o.marks);
      // if diff  == || > 0 : means both are equal or o is small
      // if diff < 0: mean o is bigger else o i smaller.
        return diff;
    }

    @Override
    public String toString() {
        return marks+" ";
    }

    public static void main(String[] args) {
        Student stu1 = new Student(34, 99.2f);
        Student stu2 = new Student(35, 82.5f);
        Student stu3 = new Student(36, 98.5f);
        Student stu4 = new Student(37, 88.5f);
        Student stu5 = new Student(38, 57.5f);

        Student[] list = {stu1, stu2, stu3, stu4, stu5};
        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);       // sort by ascending order.
//            }
//        });
        // same in lambda expression
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks)); // sort by descending order.

        System.out.println(Arrays.toString(list));
//        System.out.println(Arrays.toString(list));
//        System.out.println(stu1.compareTo(stu2));  // if bigger than 0 then next statement will not execute.
//        if (stu1.compareTo(stu2) < 0){
//            System.out.println(stu1.compareTo(stu2));
//            System.out.println("Student 2 has more marks.");
//        }
    }
}
