package generics;



class GenericClass<T>{
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
public class GenericTest {

    public static void main(String[] args) {
        GenericClass<String> genericStringObj= new GenericClass<String>("Hello");
        GenericClass<Integer> genericIntegerObj = new GenericClass<Integer>(4);

        System.out.println(genericStringObj.getData());
        System.out.println(genericIntegerObj.getData());


    }



}
