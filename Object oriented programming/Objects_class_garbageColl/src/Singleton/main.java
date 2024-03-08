package Singleton;

public class main {
    public static void main(String[] args) {
        singleton sc = singleton.getInstance(); // we are using getInstance using class name, so it need to be static.
        singleton sc1 = singleton.getInstance();
        singleton sc2 = singleton.getInstance();

        // all 3 objects refer to the same object.
    }
}
