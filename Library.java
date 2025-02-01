import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    private Map<String, Integer> books = new HashMap<>();
    public void addBook(String bookName, int count) {
        books.put(bookName, books.getOrDefault(bookName, 0) + count);
        System.out.println(count + " copies of '" + bookName + "' added to the library.");
    }
    public void issueBook(String bookName) {
        if (books.containsKey(bookName) && books.get(bookName) > 0) {
            books.put(bookName, books.get(bookName) - 1);
            System.out.println("Issued 1 copy of '" + bookName + "'.");
        } else {
            System.out.println("Sorry, '" + bookName + "' is not available.");
        }
    }
    public void returnBook(String bookName) {
        if (books.containsKey(bookName)) {
            books.put(bookName, books.get(bookName) + 1);
            System.out.println("Returned 1 copy of '" + bookName + "'.");
        } else {
            System.out.println("'" + bookName + "' does not belong to this library.");
        }
    }
    public void displayBooks() {
        System.out.println("\nBooks available in the library:");
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Map.Entry<String, Integer> entry : books.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " copies");
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: 
                    System.out.print("Enter book name: ");
                    String addBookName = scanner.nextLine();
                    System.out.print("Enter number of copies to add: ");
                    int addCount = scanner.nextInt();
                    library.addBook(addBookName, addCount);
                    break;

                case 2: 
                    System.out.print("Enter book name to issue: ");
                    String issueBookName = scanner.nextLine();
                    library.issueBook(issueBookName);
                    break;

                case 3: 
                    System.out.print("Enter book name to return: ");
                    String returnBookName = scanner.nextLine();
                    library.returnBook(returnBookName);
                    break;

                case 4: 
                    library.displayBooks();
                    break;

                case 5: 
                    System.out.println("Exiting the Library System. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
