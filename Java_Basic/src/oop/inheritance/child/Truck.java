package oop.inheritance.child;

import oop.inheritance.parent.Vehicle;

public class Truck extends Vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private String container;

    public Truck() {
        this.steering = "round";
        this.musicSystem = "yes";
        this.airConditioner = "yes";
        this.container = "yes";
    }

    public Truck(String steering, String musicSystem, String airConditioner, String container) {
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    public String getSteering() {
        return steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public String getContainer() {
        return container;
    }
}
