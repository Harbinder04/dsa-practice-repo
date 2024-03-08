package Merge_Sort;

public class Main {
    public static void main(String[] args) {
        MergeSort_2 list = new MergeSort_2();
        list.insertLast(4);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(5);
        list.insertLast(1);
        list.sortList(list.head);
        list.display();
    }
}
