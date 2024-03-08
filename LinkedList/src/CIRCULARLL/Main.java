package CIRCULARLL;

public class Main {
    public static void main(String[] args) {
        Cll list = new Cll();
        list.insert(56);
        list.insert(23);
        list.insert(76);
        list.insert(6);
        list.insert(7);
        list.delete(56);
        list.display();
    }
}
