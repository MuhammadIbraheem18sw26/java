package oop.inheritance;

import oop.inheritance.child.Bike;

public class InheritanceTest {

    public static void main(String[] args) {
        Bike bike = new Bike("long","petrol",2,1,1,"lED");
        System.out.println(bike.getHandle()+bike.getEngine()+bike.getLights()+bike.getWheels()) ;

        System.out.println(bike);
    }
}
