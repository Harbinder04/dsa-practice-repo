package Interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }

    @Override
    public void acc(int n) {
        System.out.println("Electric engine accelerate");
    }
}
