import java.util.Scanner;
class Voting {
	public static void main(String z[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter age:  ");
	int age = scanner.nextInt();
	if(age>=18) {
		System.out.println("You are eligible to vote.");
	} else {
        System.out.println("You are not eligible to vote.");
        }
	}
}