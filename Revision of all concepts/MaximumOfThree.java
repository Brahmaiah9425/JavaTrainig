import java.util.Scanner;
public class MaximumOfThree
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1 :");
    int num1 = sc.nextInt();
    System.out.println("Enter number 2 :");
    int num2 = sc.nextInt();
    System.out.println("Enter number 3 :");
    int num3 = sc.nextInt();
    int max;
    if(num1>=num2 && num1>=num3)
    {
        max = num1;
    } else if(num2>=num3 && num2>=num1)
    {
        max = num2;
    } else{
        max = num3;
    }
    System.out.println("The maximum number is :" + max);
    }
}