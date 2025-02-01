interface Employee {
	abstract double calculateSalary();
}
class Manager extends Employee {
	private String name;
    private int id;
	private double bonus;
    private double basicSalary;
    Manager(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
	}
	public double calculateSalary() {
        return basicSalary + bonus;
    }
}
class Developer implements Employee {
	private String name;
    private int id;
	private double bonus;
    private double basicSalary;
    public double projectAllowance;
    Developer(String name, int id, double basicSalary, double projectAllowance) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
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