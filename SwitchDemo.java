import java.util.Scanner;
class SwitchDemo
{
	public static void main(String z[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Two numbers: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	char c = sc.next().charAt(0);
	System.out.println("Enter charcter: ");
	
	switch(c) {
		case '+':
				System.out.println("a+b :" + (a+b));
				break;
		case '-':
				System.out.println("a-b :" + (a-b));
				break;
		case '*':
				System.out.println("a*b :" + (a*b));
				break;
		case '/':
				System.out.println("a/b :" + (a/b));
				break;
		default:
                System.out.println("Invalid operator");
                break;
        }
	}
}
	