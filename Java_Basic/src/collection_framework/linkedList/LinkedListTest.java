package collection_framework.linkedList;

import java.util.*;


class  Data<T>{
    private T data;


    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static  <E> void print(E[] arr){
        for(E element: arr){
            System.out.println(element);
        }
    }
}

class MyClass<E,N>{
    private E element;
    private N number;

    public MyClass(E element, N number) {
        this.element = element;
        this.number = number;
    }

    public E getElement() {
        return element;
    }


    public void setElement(E element) {
        this.element = element;
    }

    public N getNumber() {
        return number;
    }

    public void setNumber(N number) {
        this.number = number;
    }

    public static <E,N extends Number> void print(E element, N number){

        System.out.println("Element "+ element+" Number "+ number);
    }
}
public class LinkedListTest {

    public static void main(String[] args) {

       List<Data<Object>> list = new ArrayList<Data<Object>>();
        list.add(new Data<>("Abc"));
        list.add(new Data<>('C'));
        list.add(new Data<>(123));
        list.add(new Data<>("%"));


        System.out.println(list);

        Integer[] integers={1,2,3,4,5};
        String[]  strings={"aa","bb","cc"};

        MyClass.print("1", 3);

        Data.print(integers);
        Data.print(strings);


        Iterator<Data<Object>> iterator= list.listIterator();

        while(iterator.hasNext()){
            System.out.println("Element "+ iterator.next().getData());
        }

        System.out.println("*************************************");

        //Collections.sort(list<Object>);
        // System.out.println(list);

       // Collections.reverse(list);
       //  System.out.println(list);




    }
}
