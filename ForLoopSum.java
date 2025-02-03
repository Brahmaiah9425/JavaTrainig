import java.util.Scanner;
class ForLoopSum
{
	public static void main(String z[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter i number : ");
	int i = sc.nextInt();
	System.out.println("Enter num number : ");
	int num = sc.nextInt();
	int sum = 0;
	for(int a=i; a<=num; a++) {
		sum+=a;
	}
	System.out.println("The a value is : " +sum);
	
	}
}