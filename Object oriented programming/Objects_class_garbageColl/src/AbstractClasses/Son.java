package AbstractClasses;

public class Son extends Parent{
//    public Son(int age) { // to run parameterized constructor.
//        super(age);
//    }

    @Override
    void career() {
        System.out.println("I want to be a Engineer");
    }

    @Override
    void stream() {
        System.out.println("I have to choose stream Non-medical ");
    }

}
