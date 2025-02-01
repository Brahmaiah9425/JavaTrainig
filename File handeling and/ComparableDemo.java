import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    public int compareTo(Student st) {
        // Sorting by name (alphabetical order)
        return this.name.compareTo(st.name);

        // Alternative: Sorting by age
        // if (this.age == st.age)
        //     return 0;
        // else if (this.age > st.age)
        //     return 1;
        // else
        //     return -1;
        
        // Alternative: Sorting by roll number
        // return Integer.compare(this.rollno, st.rollno);
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(3, "G", 25));
        al.add(new Student(2, "B", 20));
        al.add(new Student(1, "A", 12));

        System.out.println("Before Sorting: ");
        for (Student s : al) {
            System.out.println("rollno: " + s.rollno + " name: " + s.name + " age: " + s.age);
        }

        // Sorting the list
        Collections.sort(al);

        System.out.println("After Sorting: ");
        for (Student s : al) {
            System.out.println("rollno: " + s.rollno + " name: " + s.name + " age: " + s.age);
        }
    }
}
