import java.util.*;

class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
        System.out.print("Enter your salary: ");
		String name = sc.nextLine();
        int salary = sc.nextInt();
		System.out.println("Your salary is: " + name);
        System.out.println("Your salary is: " + salary);
    }
}