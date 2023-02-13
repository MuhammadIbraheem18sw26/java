package javabasics;

public class MethodsTest {

    public static void displayLoop(int from,int to  ) {

        for (int i = from ; i <=to ; i++) {
            System.out.println("The Value is "+ i +"");
        }
    }

    // area of rectangular
    public static double  areaOfRectangular(double length, double width) {
        return length*width;
    }
    public static double  areaOfRectangular(double length) {
        return length;
    }

    public static void main(String[] args) {
        displayLoop(10,15);
        System.out.println("Area of Rectangular "+ areaOfRectangular(10.1,10.11));

    }
}