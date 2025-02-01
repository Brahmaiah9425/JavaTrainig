import java.util.ArrayList;

class Person {
    String name;
    int age;
    String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
    public String toString() {
        return "name = " + name + " Age = " + age + " City = " + city;
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        int i = 1;
        ArrayList<Person> personList = new ArrayList<Person>();

        personList.add(new Person("Brami", 21, "Andhra"));
        personList.add(new Person("Mahesh", 24, "vizag"));
        personList.add(new Person("Chari", 22, "vijayawada"));

        System.out.println("Person List : " + personList);

        for (Person p : personList) {
            System.out.println("Student " + i + " " + p.getName());
            i++;
        }
    }
}
