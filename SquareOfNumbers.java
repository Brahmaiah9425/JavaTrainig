import java.util.Arrays;
import java.util.List;
interface SquareCalculator {
    int show(int num);
}

public class SquareOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        SquareCalculator square = (num) -> num * num;
        numbers.forEach(num -> System.out.println("Square of " + num + " is " + square.show(num)));
    }

}