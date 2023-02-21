package collection_framework;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<Character> characterStack = new Stack<>();

        characterStack.push('a');
        characterStack.push('b');
        characterStack.push('c');
        characterStack.push('d');
        characterStack.push('e');

        System.out.println(characterStack.peek());

        if (characterStack.isEmpty())
            System.out.println("Empty");
        else System.out.println("Not Empty");

        if(characterStack.search('b') == 1){
            System.out.println("Element found");
        }else {
            System.out.println("element Not Found");
        }

        System.out.println(characterStack.pop());
        System.out.println(characterStack);
    }

}
