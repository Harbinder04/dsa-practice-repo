package Interfaces;

public class Car implements Engine, Brake, Media{  // Note: Interfaces allows to inherit more than one class to one.
    int i = 3;
    @Override
    public void start() {
        System.out.println("I am starting car's engine.");
    }

    @Override
    public void stop() {
        System.out.println("I am stop car's engine");
    }

    @Override
    public void acc(int n) {
        System.out.println("I am accelerating car by "+ n);
    }

    @Override
    public void brake() {
        System.out.println("Apply brake to the car");
    }
}
