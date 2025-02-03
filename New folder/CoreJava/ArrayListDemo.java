package CoreJava;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo
{
    public static void main(String args[])
    {
        ArrayList<String> fruits = new ArrayList<String>
        fruits.add("Grapes");
        fruits.add("Banaana");
        fruits.add("Mango");
        fruits.add("orange");
        fruits.add("papaya");
        System.out.println("The list of an array of fruits:" +fruits);
        System.out.println("List of an arrays using the for loop");
        for(int i=0; i<=fruits.size(); i++)
        {
            System.out.println("Fruits is : "+fruits.get(i));
        }
        for(String s:fruits)
        {
            System.out.println(i);
        }
        System.out.println("List of an arrays using the sorting");
        Collections.sort(fruits);
        System.out.println(fruits);
        System.out.println("Index Based Search 0 : " + fruits.get(0));
        fruits.set(4,"kamala");
        System.out.println("After set new data : " + fruits);
        fruits.remove(0);
        System.out.println("After Remove 0th element : " + fruits);
        System.out.println("Size of ArrayList : " + fruits.size());
        fruits.clear();
        System.out.println("After clear data : " + fruits);
        ArrayList person = new ArrayList();
        person.add("Brahmaiah");
        person.add("20");
        person.add("Andhra");
        System.out.println(person);



    }
}