package LINKEDLIST;

public class Main {
    public static void main(String[] args) {
    LL list = new LL();
    list.insertFirst(10);
    list.insertFirst(15);
    list.insertRec(23, 2);

    list.display();
    }
}
