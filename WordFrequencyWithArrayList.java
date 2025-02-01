import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordFrequencyWithArrayList {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Brahmaiah.T\\OneDrive\\Desktop\\Java-Practice\\input.txt";
        ArrayList<String> uniqueWords = new ArrayList<>();
        ArrayList<Integer> wordCounts = new ArrayList<>();

        try (FileReader fr = new FileReader(filePath)) {
            StringBuilder content = new StringBuilder();
            int ch;
            while ((ch = fr.read()) != -1) {
                content.append((char) ch);
            }

            Scanner scanner = new Scanner(content.toString().toLowerCase());
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (uniqueWords.contains(word)) {
                    int index = uniqueWords.indexOf(word);
                    wordCounts.set(index, wordCounts.get(index) + 1);
                } else {
                    uniqueWords.add(word);
                    wordCounts.add(1);
                }
            }
            System.out.println("Word Frequencies:");
            for (int i = 0; i < uniqueWords.size(); i++) {
                System.out.println(uniqueWords.get(i) + ": " + wordCounts.get(i));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
