package collection_framework;



class Names implements Comparable<Names>{
    String name;
    public Names(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Names o) {
        return 0;
    }
}
public class CompareToTest {
}
