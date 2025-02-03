import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface EvenOrOdd1 {
    String show(int num);  
}

public class EvenOrOddDemo1 {
    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>();
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        EvenOrOdd checker = (num) -> (num % 2 == 0) ? "Even" : "Odd";
        numbers.forEach(num -> System.out.println(num + " is " + checker.show(num)));
    }
}
