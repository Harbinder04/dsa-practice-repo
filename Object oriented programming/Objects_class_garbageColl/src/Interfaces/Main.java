package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
        Engine e1 = new Car();

//        car.start();
//        car.acc(10);
//        car.brake();
//        car.stop();

//        e1.start();
//        e1.acc(10);
//        e1.stop();

        // there is problem that it can only call the  start which is overridden in car() method.
        Media m1 = new Car();
        m1.start();   // starting car's engine not media player
        m1.stop();    // Stopping car's engine not media player

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
        car.startMusic();
    }
}
