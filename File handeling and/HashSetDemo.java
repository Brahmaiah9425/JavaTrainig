import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(10);  
        num.add(15);
        num.add(50);
        num.add(5);
        System.out.println(num);
    }
}