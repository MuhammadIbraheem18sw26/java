package oop.abstraction.interfaces;

public class PhoneClass implements PhoneInterface {
    @Override
    public String processor() {
        return "snapdragon 835";
    }

    @Override
    public String Os() {
        return "Android 12 ";
    }

    @Override
    public int GB() {
        return 1;
    }

    public static void main(String[] args) {
        PhoneClass phoneClass= new PhoneClass();
        System.out.println(phoneClass.GB());
        PhoneInterface phoneInterface=new PhoneClass();
    }
}
