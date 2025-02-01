import java.util.Scanner;
class PalindromeLoop
{
	public static void main(String z[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter i number : ");
	int i = sc.nextInt();
	System.out.println("Enter n number : ");
	int n = sc.nextInt();
	for (int a=i; a<=n; a++) {
		int r, sum = 0;
		int tem = a;
		while(tem!=0) {
		r = tem%10;
		sum = sum*10+r;
		tem=tem/10;
		}
		if (a == sum) {
			System.out.println("It is a palindrome" +a);
		} else {
			System.out.println("It is not a palindrome" +a);
			}
	}
	}
}