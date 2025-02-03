import java.util.ArrayList;
import java.util.Comparator;

class Product1 {
    String name;
    int price;

    Product1(String name, int price)
     {
        this.name = name;
        this.price = price;
    }

    String getName() 
    {
        return name;
    }

    int getPrice() 
    
    {
        return price;
    }
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + "}\n";
    }
}

public class MethodReferenceOperatorDemo {
    public static void main(String[] args) {
        ArrayList<Product1> productList = new ArrayList<>();

        productList.add(new Product1("Mobile", 50000));
        productList.add(new Product1("TV", 80000));
        productList.add(new Product1("AC", 45000));
        productList.add(new Product1("Fridge", 85000));

        System.out.println("Product List:");
        System.out.println(productList);
        productList.sort(Comparator.comparing(Product1::getName));
        System.out.println("After sort by Name:");
        System.out.println(productList);
        productList.sort(Comparator.comparing(Product1::getPrice));
        System.out.println("After sort by Price:");
        System.out.println(productList);
        System.out.println("For Each Output:");
        productList.forEach(System.out::println);
    }
}
