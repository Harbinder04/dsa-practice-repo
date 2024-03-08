package DLL;

public class Main{
    public static void main(String[] args) {
        Dll list = new Dll();
        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(2);
        list.insertFirst(34);
//        list.insertLast(45);
        list.insert(23, 3);
        list.display();
    }
}
