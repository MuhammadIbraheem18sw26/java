package innerclass;

public class InnerClassDemo {

    class InnerClass{
        public void print(){
            System.out.println("This is InnerClass ");
        }

       void innerDisplay(){
            InnerClass innerClass= new InnerClass();

            innerClass.print();
        }
    }


}

class Demo{
    public static void main(String[] args) {

        InnerClassDemo innerClassDemo= new InnerClassDemo();

        innerClassDemo.innerDisplay();
    }
}
