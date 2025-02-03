import java.util.Scanner;
interface EvenOrOdd
{
    String show(int num);
}
public class EvenOrOddDemo
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number is :");
        int number = scanner.nextInt();
        EvenOrOdd checker = (num) -> (num%2==0) ? "Even" : "Odd";
        System.out.println(number + " is " + checker.show(number));
    }
}