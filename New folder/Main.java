abstract class Employee {
    String name;
    int id;
    double basicSalary;
    Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }
	
    abstract double calculateSalary();
}
class Manager extends Employee {
    double bonus;
    Manager(String name, int id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }
    double calculateSalary() {
        return basicSalary + bonus;
    }
}
class Developer extends Employee {
    double projectAllowance;
    Developer(String name, int id, double basicSalary, double projectAllowance) {
        super(name, id, basicSalary);
        this.projectAllowance = projectAllowance;
    }
    double calculateSalary() {
        return basicSalary + projectAllowance; 
    }
}
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Brahmaiah", 101, 50000, 10000);
        Developer developer = new Developer("Ramesh", 102, 40000, 5000);
		
        System.out.println("Manager's Salary: " + manager.calculateSalary());
        System.out.println("Developer's Salary: " + developer.calculateSalary());
    }
}
