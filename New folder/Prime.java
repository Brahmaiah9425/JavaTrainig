import java.util.Scanner;
class Prime 
{
	public static void main(String z[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		for(int i=2; i<=a; i++)
		{
			int count = 0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0) {
					count++;
				}
			}
			if(count == 2) 
			{
				System.out.println("Prime number is : " +i);
			}
		}
	}
}