package collection_framework.linkedList;

import java.util.*;

public class LinkedListTest {

    public static void main(String[] args) {

       List<Integer> integerLinkedList = new LinkedList<Integer>();
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(5);

        System.out.println(integerLinkedList);




        Iterator<Integer> iterator= integerLinkedList.iterator();

        while(iterator.hasNext()){
            System.out.println("Element "+ iterator.next());
        }

        System.out.println("*************************************");

        Collections.sort(integerLinkedList);
        System.out.println(integerLinkedList);

        Collections.reverse(integerLinkedList);
        System.out.println(integerLinkedList);




    }
}
