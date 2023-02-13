package oop.inheritance.parent;

public class Vehicle {
    private String engine;
    private int wheels;
    private int seats;
    private int fueTank;
   private String lights;

    public Vehicle() {
        this.engine = "yes";
        this.wheels = 4;
        this.seats = 4;
        this.fueTank = 1;
        this.lights = "yes";
    }

    public Vehicle(String engine, int wheels, int seats, int fueTank, String lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fueTank = fueTank;
        this.lights = lights;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getFueTank() {
        return fueTank;
    }

    public String getLights() {
        return lights;
    }
}
