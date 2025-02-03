import java.util.Scanner;
class ForLoopPrime
{
	public static void main(String z[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter i number : ");
	int i = sc.nextInt();
	System.out.println("Enter num number : ");
	int num = sc.nextInt();
	int c = 2;
	for(int a=i; a<=num; a++) {
		if(a%c==0){
		System.out.println("The a value is prime : " +a);
		}
	}
	}
}