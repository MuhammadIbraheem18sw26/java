public class LoopsTest {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("for loop is iterating and i = "+i);
        }
        // while loop
        int j=10;
        while (j>0){
            System.out.println("for loop is iterating and j = "+j);
            j--;
        }

        // do while
        int k=0;
        do {
            System.out.println("for loop is iterating and k = "+k);
            k++;
        }while(k<10);

        // two variables in Single Variable
        for (int i = 0,l=1; i <10 || l<9 ; i++,j++) {
            System.out.println("for loop is iterating and k = "+i+ "And L is = "+l);
        }


    }
    
    // loop using two variables 
    
}
