import java.util.Scanner;
class ForLoopPrime
{
	public static void main(String z[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter i number : ");
	int i = sc.nextInt();
	System.out.println("Enter num number : ");
	int num = sc.nextInt();
	for (int a = i; a <= num; a++) {
		for (int j = 2; j<a; j++) {
			if(a%j==0) {
				break;
		} else {
			System.out.println("Prime :" +a);
			}
		}
	}
}
}