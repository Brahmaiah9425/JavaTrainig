import java.util.Scanner;
class Number {
	public static void main(String z[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number:  ");
	int number = scanner.nextInt();
	if (number>=0) {
		System.out.println("Number is Positive ");
	} else {
		System.out.println("Number is Negative ");
		}
	}
}