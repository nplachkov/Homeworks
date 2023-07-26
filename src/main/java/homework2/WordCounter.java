package homework2;

public class WordCounter {
    String sentence = "";
    int wordCount = countWords(sentence);
    public static int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.trim().split("\\s+").length;
    }
}
