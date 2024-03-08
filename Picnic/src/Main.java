import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String filename = "Picnic/src/fruits.txt";
        PicnicAnalyzer picnicAnalysis = new PicnicAnalyzer(filename);

        // Count words
        int wordCount = picnicAnalysis.countWords(filename);
        System.out.println("Общее количество слов: " + wordCount);

        // Find the longest word
        String longestWord = picnicAnalysis.findLongestWord(filename);
        System.out.println("Самое длинное слово: " + longestWord);

        // Calculate word frequencies
        Map<String, Integer> wordFrequencies = picnicAnalysis.calculateWordFrequencies(filename);
        System.out.println("Частота слов: " + wordFrequencies);
    }
}