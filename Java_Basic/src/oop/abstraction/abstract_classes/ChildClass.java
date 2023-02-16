package oop.abstraction.abstract_classes;

public  class ChildClass extends AbstractClass{

   @Override
    int abstratMethod() {
        return 1;
    }

    public static void main(String[] args) {
        ChildClass childClass= new ChildClass();


        System.out.println(childClass.concreteMethod());

    }
}
