package exception_handling;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ExcepHandling {

    static void display(double a,double b ){
        System.out.println("Method");
        Scanner input= new Scanner(System.in);

        System.out.println("Enter value for a ");
        int value1= input.nextInt();
        System.out.println("Enter value for b ");
        int value2= input.nextInt();

        System.out.println("value a"+ value1+ " "+ value2);
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter value for a ");
        int value1= input.nextInt();
        System.out.println("Enter value for b ");
        int value2= input.nextInt();

        BigDecimal d1 = BigDecimal.valueOf(value1);
        BigDecimal d2 = BigDecimal.valueOf(value2);


        System.out.println("Division of a and b ");

        try{
            BigDecimal d3 = d1.divide(d2);
            System.out.println("a/b = "+ d3);
    }
        catch (Exception e){
            System.out.println("The divisor is 0"+e );
           //10
            // e.printStackTrace();


        }

        finally {
            ExcepHandling.display(10.1,20.0);
        }
    }
}
