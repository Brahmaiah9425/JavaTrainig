import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "aaa");
        hm.put(2, "bbb");
        hm.put(3, "ccc");
        System.out.println(hm);
        System.out.println(hm.get(2));
        System.out.println(hm.containsKey(3));
        System.out.println(hm.containsValue("ddd"));
        hm.remove(3);
        System.out.println(hm);
    }
}
