package oop.inheritance.child;

import oop.inheritance.parent.Vehicle;

public class Car extends Vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private String fridge;
    private String entertainmentSystem;

    public Car() {
        this.steering = "round";
        this.musicSystem = "yes";
        this.airConditioner = "yes";
        this.fridge = "yes";
        this.entertainmentSystem = "yes";
    }

    public Car(String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem) {
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.fridge = fridge;
        this.entertainmentSystem = entertainmentSystem;
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

    public String getFridge() {
        return fridge;
    }

    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }
}
