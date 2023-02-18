package innerclass;

public class StaticInnerClassTesting {


    static class InnerClassDemoStatic{

        public static void innerStaticDisplay(){
            System.out.println("This is Static Inner Class ");
        }
    }
}

class DemoStaticInner{
    public static void main(String[] args) {
        StaticInnerClassTesting.InnerClassDemoStatic.innerStaticDisplay();
    }
}
