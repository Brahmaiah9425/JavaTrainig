import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + ": $" + price;
    }
}

class ShoppingCart {
    private Map<String, Integer> cart = new HashMap<>();
    private Map<String, Product> productCatalog = new HashMap<>();

    public void addProductToCatalog(Product product) {
        productCatalog.put(product.getName(), product);
    }

    public void addToCart(String productName, int quantity) {
        if (productCatalog.containsKey(productName)) {
            if (cart.containsKey(productName)) {
                int existingQuantity = cart.get(productName);
                cart.put(productName, existingQuantity + quantity);
            } else {
                cart.put(productName, quantity);
            }
            System.out.println(quantity + " units of '" + productName + "' added to the cart.");
        } else {
            System.out.println("Product '" + productName + "' is not available.");
        }
    }

    public void displayBill() {
        double totalAmount = 0;
        System.out.println("\nItems in your cart:");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String productName = entry.getKey();
            int quantity = entry.getValue();
            double price = productCatalog.get(productName).getPrice();
            double totalProductPrice = price * quantity;
            totalAmount += totalProductPrice;
            System.out.println(productName + " x" + quantity + ": $" + totalProductPrice);
        }
        System.out.println("\nTotal Bill: $" + totalAmount);
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        cart.addProductToCatalog(new Product("Laptop", 1000.00));
        cart.addProductToCatalog(new Product("Smartphone", 600.00));
        cart.addProductToCatalog(new Product("Headphones", 150.00));
        cart.addProductToCatalog(new Product("Keyboard", 50.00));

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. View Bill");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addToCart(productName, quantity);
                    break;

                case 2:
                    cart.displayBill();
                    break;

                case 3:
                    System.out.println("Exiting the Shopping Cart System. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
