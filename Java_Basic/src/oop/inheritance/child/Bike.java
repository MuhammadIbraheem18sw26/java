package oop.inheritance.child;

import oop.inheritance.parent.Vehicle;

public class Bike extends Vehicle {
    private String handle;

    public Bike() {
        super();
        handle="short";
    }

    public Bike(String handle,String engine, int wheels, int seats, int fueTank, String lights) {
        super(engine, wheels, seats, fueTank, lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + getHandle() + '\'' +"lights='" + getLights() + '\'' +
                "wheels='" + getWheels() + '\'' +
                '}';
    }
}

