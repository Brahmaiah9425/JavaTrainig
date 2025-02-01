import java.util.ArrayList;
class Car
{
    String carName;
    double price;
    String color;
    public Car(String carName, double  price, String color)
    {
        this.carName=carName;
        this.price=price;
        this.color=color;
    }
    public String getcarName() {
        return carName;
    }
    public double  getprice() {
        return price;
    }
    public String getcolor() {
        return color;
    }
    public String toString() {
        return "name = " + carName + "price = " + price + "color = " + color;  
    }
}
public class CarDemo
{
    public static void main(String args[])
    {
        int i = 1;
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Car("Toyota Corolla", 25000.0, "red"));
        carList.add(new Car("Honda Civic", 23000.0, "black"));
        carList.add(new Car("BMW", 1000000.00, "blue"));
        System.out.println("List of Cars:" + carList);
        for (Car c : carList) {
            
            System.out.println("CarName " + i + " " + c.getcarName());
            i++;
        }
    }
}