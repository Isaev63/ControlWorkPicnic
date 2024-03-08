import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PicnicAnalyzer {
    private String filename;

    public PicnicAnalyzer(String filename) {
        this.filename = filename;
    }

    // Count words
    public int countWords(String filename) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    // Find the longest word
    public String findLongestWord(String filename) {
        String longestWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return longestWord;
    }

    // Calculate word frequencies
    public static Map<String, Integer> calculateWordFrequencies(String filename) {
        Map<String, Integer> wordFrequencies = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Приводим слово к нижнему регистру и удаляем лишние пробелы
                    word = word.toLowerCase().trim();
                    // Проверяем, что слово не пустое
                    if (!word.isEmpty()) {
                        wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordFrequencies;
    }
}