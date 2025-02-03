import java.util.scanner;
class UserInput {
	public static void main(String a[]) {
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	int salary = sc.nextInt();
	System.out.println("Name = " +name);
	System.out.println("Salary = " +salary);
	}
}