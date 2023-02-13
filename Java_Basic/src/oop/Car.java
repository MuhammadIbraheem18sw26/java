package oop;

public class Car {
    private String door;
    private String engine;
    private String driver;
    private float speed;

    public Car() {
        door="close";
        engine="on";
        driver="not seated";
        speed=0;
    }

    public Car(String door, String engine, String driver, float speed) {
        this.door = door;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getDoor() {
        return door;
    }

    public String getEngine() {
        return engine;
    }

    public String getDriver() {
        return driver;
    }

    public float getSpeed() {
        return speed;
    }

    public String run (){
        if(door.equals("close") && driver.equals("seated")&&speed>0){
            return "Car is runing";

        } else {
            return "car is not running";
        }

    }

}
