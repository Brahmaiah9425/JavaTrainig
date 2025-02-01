import java.util.Scanner;

interface Order {
    void placeOrder(String product, int quantity);
}

interface Trackable {
    void trackOrder(String orderID);
}

class OnlineOrder implements Order, Trackable {
    private String product;
    private int quantity;
    private String orderID;

    public void placeOrder(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.orderID = orderID;
        System.out.println("Order placed successfully. Order ID: " + orderID);
        System.out.println("Product: " + product + ", Quantity: " + quantity);
    }

    public void trackOrder(String orderID) {
        this.orderID = orderID;
        System.out.println("Tracking order with Order ID: " + orderID);
    }
}

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        OnlineOrder order = new OnlineOrder();
        
        System.out.println("Enter product name: ");
        String product = scanner.nextLine();
        
        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();
        
        order.placeOrder(product, quantity);
        
        scanner.nextLine();
        System.out.println("Enter Order ID to track: ");
        String orderID = scanner.nextLine();
        
        order.trackOrder(orderID);
        
        scanner.close();
    }
}