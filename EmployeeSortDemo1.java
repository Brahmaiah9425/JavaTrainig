import java.util.ArrayList;
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
public class EmployeeSortDemo1
{
public static void main(String args[])
{
        ArrayList<EmployeeDetails> employeeList = new ArrayList<>();
        employeeList.add(new EmployeeDetails("Brahmaiah","Developer", "Mumbai", 25000));
        employeeList.add(new EmployeeDetails("Ravi", "Tester", "Mumbai", 35000));
        employeeList.add(new EmployeeDetails("Ramesh","Developer", "Pune", 40000));
        employeeList.add(new EmployeeDetails("Ajith", "Developer", "Mumbai",  28000));
        employeeList.add(new EmployeeDetails("Mahesh", "Tester", "Chennai", 27000));
        for (EmployeeDetails emp : employeeList) {
            emp.applySalaryHike();
        }
        System.out.println("Before sorting:");
        System.out.println(employeeList);
        employeeList.sort(Comparator.comparing(EmployeeDetails::getName));
        System.out.println("After sort by Name:");
        System.out.println(employeeList);
        employeeList.sort(Comparator.comparing(EmployeeDetails::getPost));
        System.out.println("After sort by Post:");
        System.out.println(employeeList);
        employeeList.sort(Comparator.comparing(EmployeeDetails::getCity));
        System.out.println("After sort by City:");
        System.out.println(employeeList);
        employeeList.sort(Comparator.comparing(EmployeeDetails::getSalary));
        System.out.println("After sort by City:");
        System.out.println(employeeList);
        System.out.println("For Each Output:");
        employeeList.forEach(System.out::println);
}

}
