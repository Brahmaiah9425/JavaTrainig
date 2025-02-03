import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int lowercaseCount = 0, uppercaseCount = 0, digitCount = 0, specialCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (String.valueOf(ch).matches("[a-z]")) {
                lowercaseCount++;
            }
            else if (String.valueOf(ch).matches("[A-Z]")) {
                uppercaseCount++;
            }
            else if (String.valueOf(ch).matches("[0-9]")) {
                digitCount++;
            }
            else if (String.valueOf(ch).matches("[^a-zA-Z0-9]")) {
                specialCount++;
            }
        }
        System.out.println("Lowercase letters: " + lowercaseCount);
        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special characters: " + specialCount);
    }
}
