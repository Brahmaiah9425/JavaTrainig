import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Brahmaiah");
        names.add("Thangedupalli");
        names.add("Pullaiah");
        names.add("Penchalamma");
        System.out.println("Initial List: " + names);
        names.addFirst("Malleswari");
        System.out.println("After adding at first: " + names);
        names.addLast("Madhavi");
        System.out.println("After adding at last: " + names);
        names.remove(4);  
        System.out.println("After removing city at index 4: " + names);
        names.removeFirst();
        System.out.println("After removing first city: " + names);
        names.removeLast();
        System.out.println("After removing last city: " + names);
        if (names.contains("Pullaiah")) {
            System.out.println("Yes, Pullaiah tickets are available.");
        } else {
            System.out.println("Pullaiah tickets are not available.");
        }
        System.out.println("Remaining names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
