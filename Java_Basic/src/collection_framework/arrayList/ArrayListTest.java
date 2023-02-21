package collection_framework.arrayList;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();

        // Add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println(list.get(0));

        if(list.contains(4)){
            list.remove(3);
            list.set(3,5);
        }
        else{
            System.out.println("List does not contain the element");
        }

        System.out.println(list);

        for (Integer item: list
             ) {
            System.out.println(item);
        }

    }
}
