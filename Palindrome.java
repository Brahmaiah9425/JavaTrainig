import java.util.Scanner;
class Palindrome
{
	public static void main(String z[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n number : ");
	int n = sc.nextInt();
	int tem, r, sum = 0;
	tem = n;
	while(n!=0) {
		r = n%10;
		sum = sum*10+r;
		n=n/10;
	}
	if (tem == sum) {
		System.out.println("It is a palindrome");
	} else {
		System.out.println("It is not a palindrome");
		}
	}
}