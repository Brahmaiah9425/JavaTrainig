import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileAllDemo1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        String obj = sc.nextLine(); 

        try {
            File file = new File(obj); 
            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write("Hello Brahmaiah, How are you?");
                    System.out.println("Successfully wrote to the file");
                } catch (IOException e) {
                    System.out.println("Error writing to file: " + e);
                }
            }
            if (file.exists()) {
                System.out.println("File Reading... ");

                
                try (Scanner fileScanner = new Scanner(file)) {
                    while (fileScanner.hasNextLine()) {  
                        String data = fileScanner.nextLine();
                        System.out.println(data);
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Error reading file: " + e);
                }
            } else {
                System.out.println("File not found.");
            }
			
            if (file.getName()==("Thangedupalli.txt")) {
                if (file.delete()) {
                    System.out.println("File is deleted successfully.");
                } else {
                    System.out.println("Failed to delete the file.");
                }
            }

        } catch (IOException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
