import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(25);
        ts.add(10);
        ts.add(35);
        ts.add(15);
        ts.add(10);  
        System.out.println("tree set (Sorted Set) : " + ts);
        System.out.println("Tree set first : " + ts.first());
        System.out.println("last : " + ts.last());
    }
}
