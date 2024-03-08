package LearnStatic;

public class staticScope {
    public static void main(String[] args) {
        display();  // you can not access the method which is not static.
        staticScope obj = new staticScope();
        obj.display2();
    }
    static void display(){
//        greeting(); // you can't use this because this request some instance
        // but the function in which you are using it, does not depend on instances i.e. static.

        // WAY TO ACCESS  : By making object reference to it.
        staticScope obj = new staticScope();
        obj.greeting();
    }
    void display2(){
        greeting();
    }
    void greeting(){
//        display(); // you can use this function because this is not restricted to have an instance.
        System.out.println("Thanks for visiting!");
    }
    /* In  short, you can use static function in non-static func.
    * but can not use non-static inside static function.
    * 1. But there is a way to access this non-static function by explicitly
    *    mentioning the object reference to it.
    * Conclusion: You have to make an abject in order to use non-static method or make it static.*/
}
