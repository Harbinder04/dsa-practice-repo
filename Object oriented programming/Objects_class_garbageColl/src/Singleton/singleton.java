package Singleton;

public class singleton {
    // Singleton class is a class used if we want only one instance of that class.
    private singleton(){

    }
    private static singleton instance; // to be accessed by getInstance function it need to be static.
    public static singleton getInstance(){  // here it need to be static because it does not depend on the singleton class instance.
        if (instance == null){  // if instance is not there then created otherwise not.
            instance = new singleton();
        }
        return instance;
    }
}
