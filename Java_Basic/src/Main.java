import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.printf("Hi ");
        char b='$';
        double a=10.1;
        double c=10.1;
        BigDecimal value1= new BigDecimal("10.01");
        BigDecimal value2= new BigDecimal("10.01");
                System.out.println(value1.add(value2));
        System.out.println(a+c);
        System.out.println("\u00BB");

    }
}