package innerclass;

import java.util.Scanner;

public abstract class AnonymousInnerClass {
    abstract void print();
}
class  OuterClass{
    static int i=10;
    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass() {

            @Override
            void print() {
                System.out.println("This is Anonymous Inner Class"+OuterClass.i);
            }
        };


        anonymousInnerClass.print();

    }
}
