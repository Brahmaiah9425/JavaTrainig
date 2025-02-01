import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    public String toString() {
        return "Product {Name : " + name + " Price : " + price + "}\n";
    }
}

class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("Mobile", 50000.80));
        productList.add(new Product("TV", 80000.70));
        productList.add(new Product("AC", 45000.90));
        productList.add(new Product("Frige", 85000.80));
        System.out.println("Before sorting:");
        System.out.println(productList);
        Collections.sort(productList, new NameComparator());
        System.out.println("After sorting by Name:");
        System.out.println(productList);

        Collections.sort(productList, new PriceComparator());
        System.out.println("After sorting by Price:");
        System.out.println(productList);
    }
}
