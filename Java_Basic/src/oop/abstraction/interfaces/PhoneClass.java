package oop.abstraction.interfaces;

public class PhoneClass implements PhoneInterface{
    @Override
    public String processor() {
        return "a";
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
        System.out.println(phoneClass.processor());

        String a="abc";
        System.out.println(a.length());

    }
}
