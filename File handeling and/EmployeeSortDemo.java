import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeDetails
{
    String name;
    String post;
    String city;
    double salary;
        EmployeeDetails(String name, String post, String city, double salary)
        {
            this.name = name;
            this.post = post;
            this.city = city;
            this.salary = salary;
        }
        String getName()
        {
            return name;
        }
        String getPost()
        {
            return post;
        }
        String getCity()
        {
            return city;
        }
        double getSalary()
        {
            return salary;
        }
        public String toString() {
            return "EmployeeDetails {Name : " + name + ", Post : " + post + ", City : " + city + ", Salary : " + salary + "}\n";
        }
        public void applySalaryHike() {
            if (post.toLowerCase().equals("developer") && salary < 30000) {
                salary += salary * 0.25;
            } else if (post.toLowerCase().equals("tester") && city.toLowerCase().equals("mumbai")) {
                salary += salary * 0.20; 
            }
        }
}

class NameComparator implements Comparator<EmployeeDetails> {
    public int compare(EmployeeDetails e1, EmployeeDetails e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class PostComparator implements Comparator<EmployeeDetails> {
    public int compare(EmployeeDetails e1, EmployeeDetails e2) {
        return e1.getPost().compareTo(e2.getPost());
    }
}

class CityComparator implements Comparator<EmployeeDetails> {
    public int compare(EmployeeDetails e1, EmployeeDetails e2) {
        return e1.getCity().compareTo(e2.getCity());
    }
}

class SalaryComparator implements Comparator<EmployeeDetails> {
    public int compare(EmployeeDetails e1, EmployeeDetails e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}

public class EmployeeSortDemo {
    public static void main(String[] args) {
        ArrayList<EmployeeDetails> employeeList = new ArrayList<>();
        employeeList.add(new EmployeeDetails("Brahmaiah","Developer", "Mumbai", 25000));
        employeeList.add(new EmployeeDetails("Ravi", "Tester", "Mumbai", 35000));
        employeeList.add(new EmployeeDetails("Ramesh","Developer", "Pune", 40000));
        employeeList.add(new EmployeeDetails("Ajith", "Developer", "Mumbai",  28000));
        employeeList.add(new EmployeeDetails("Mahesh", "Tester", "Chennai", 27000));
        for (EmployeeDetails emp : employeeList) {
            emp.applySalaryHike();
        }
        System.out.println("Before Sorting:");
        System.out.println(employeeList);
        Collections.sort(employeeList, new NameComparator());
        System.out.println("After sorting by Name:");
        System.out.println(employeeList);
        Collections.sort(employeeList, new PostComparator());
        System.out.println("After sorting by Post:");
        System.out.println(employeeList);
        Collections.sort(employeeList, new CityComparator());
        System.out.println("After sorting by City:");
        System.out.println(employeeList);
        Collections.sort(employeeList, new SalaryComparator());
        System.out.println("After sorting by Salary:");
        System.out.println(employeeList);
    }
}


