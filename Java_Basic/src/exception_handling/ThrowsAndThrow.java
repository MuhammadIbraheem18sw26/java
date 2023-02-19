package exception_handling;

import java.io.FileReader;

public class ThrowsAndThrow {

   public enum ListA { IBRA,Hee};
     public final static void method() throws Exception{

         FileReader reader=new FileReader("file.txt");
         throw new Exception();
     }

    public static void main(String[] args) {

         ListA list = ListA.IBRA;

         switch(list){

             case IBRA :
                 System.out.println("Ibrahim");
                 System.out.println("IBRA");
             break;
             case Hee :
                 System.out.println("Hey");
                 System.out.println("Hee");
                 break;
             default:
                 System.out.println("Deault");
         }
        try {
            method();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
