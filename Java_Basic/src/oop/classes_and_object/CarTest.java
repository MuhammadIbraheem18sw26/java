package oop.classes_and_object;

import oop.classes_and_object.Car;

public class CarTest  {

    public static void main(String[] args) {
        Car car= new Car();

        car.setDoor("close");
        car.setSpeed(10);
        car.setDriver("seated");

        System.out.println(car.run())  ;
    }
}
