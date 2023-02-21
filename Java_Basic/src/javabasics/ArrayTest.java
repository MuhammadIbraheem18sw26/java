package javabasics;

public class ArrayTest {

   static void checkPalindrome(String str){
        System.out.println("====================Palindrome=====================");
       char[] charStr= str.toCharArray();
       int counter=0;
        for(char item :charStr){
            counter++;
        }
        int index=1;
        String str1="";
       String str2="";
        for (int i = 0; i <counter ; i++) {

            System.out.println("comparision == char "+ charStr[i]+ " and char negative "+charStr[counter-index]);
            str1+=charStr[i];
            str2+=charStr[counter-index];
            index++;
        }

       System.out.println(str1 + "and "+str2 );

        if(str1.equals(str2)){
            System.out.println("The given string is Palindrome");
        }
        else {
            System.out.println("The given string is not Palindrome");
        }

    }

    static void checkPalindromeLengthFun(String str){
        System.out.println("====================Palindrome length=====================");
        char[] charStr= str.toCharArray();

        int index=1;
        String str1="";
        String str2="";
        for (int i = 0; i <charStr.length ; i++) {

            System.out.println("comparision == char "+ charStr[i]+ " and char negative "+charStr[charStr.length-index]);
            str1+=charStr[i];
            str2+=charStr[charStr.length-index];
            index++;
        }

        System.out.println(str1 + " and "+str2 );

        if(str1.equals(str2)){
            System.out.println("The given string is Palindrome");
        }
        else {
            System.out.println("The given string is not Palindrome");
        }

    }
    public static void main(String[] args) {
        int[] arr = new int[10];

        arr[0]=1;
        System.out.println(arr[0]+ arr[1]);

        String strArray[]={"a","b", "c", "d","e"};
        int counter=0;

        for (String item: strArray
             ) {

            System.out.println(item);
                counter++;
        }

        System.out.println(counter);

        for (int i = counter-1; i >=0 ; i--) {
            System.out.println(strArray[i]);
        }
        int index=0;
        while(index<counter){
            System.out.println(strArray[index]);
            index++;
        }

        String str= "Ibrahim";

    char[] charArray= str.toCharArray();

        for (char charItem: charArray
             ) {
            System.out.println(charItem);
        }


        ArrayTest.checkPalindromeLengthFun("aziza");

    }
}


