import java.util.Scanner;
class WhileLoop
{
	public static void main(String z[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter i number : ");
	int i = sc.nextInt();
	System.out.println("Enter num number : ");
	int num = sc.nextInt();
	int a = i;
	while(a<=num) {
		System.out.println("The a value is : " +a);
		a++;
	}
	}
}