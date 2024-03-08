package Interfaces.NestedInterface;

public class B implements A.nestedInterface {

    @Override
    public boolean odd(int num) {
        return (num & 1) == 1;
    }
}
