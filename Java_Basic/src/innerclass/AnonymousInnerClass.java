package innerclass;

public abstract class AnonymousInnerClass {
    abstract void print();
}

class OuterClass{

    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass() {
            @Override
            void print() {
                System.out.println("This is Anonymous Inner Class");
            }
        };

        anonymousInnerClass.print();
    }
}
