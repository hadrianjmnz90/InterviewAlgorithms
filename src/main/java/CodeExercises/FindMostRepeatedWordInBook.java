package CodeExercises;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMostRepeatedWordInBook {
    static List<String> findMostRepeatedWords(String text) {
        String[] words = text.split("\\s+"); //removes white spaces
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("*****");
        Map<String, Integer> wordFrequency = new HashMap<>();
        int maxFrequency = 0;
        for (String word : words) {
            word = word.toLowerCase();
            int frequency = wordFrequency.getOrDefault(word, 0) + 1;
            wordFrequency.put(word, frequency);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }
        List<String> mostRepeatedWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                mostRepeatedWords.add(entry.getKey());
            }
        }
        return mostRepeatedWords;
    }

    @Test
    static void testFindMostRepeatedWord() {
        String text = "This is a sample text with repeated words. This is a test text for finding the most repeated word. words";
        List<String> mostRepeated = findMostRepeatedWords(text);
        System.out.println("Most Repeated Words: " + mostRepeated);
    }

    @Test
    static void encuentraLaPalabraRepetida() {
        String text = "Un dia, uno, este dia, el un dia. este ";
        text = text.toLowerCase().replaceAll("[^A-Z a-z]", " ").replaceAll("\\s+", " ");
        String[] wordsInText = text.split(" ");
        for (String word : wordsInText) {
            System.out.println(word);
        }
        int maxFrequency = 0;
        Map<String, Integer> wordsHashMap = new HashMap<>();
        for (String word : wordsInText) {
            int frequency = wordsHashMap.getOrDefault(word, 0) + 1;
            wordsHashMap.put(word, frequency);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        List<String> mostRepeatedWords = new ArrayList<>();
        for (Map.Entry<String, Integer> wordInBox : wordsHashMap.entrySet()) {
            if (wordInBox.getValue() == maxFrequency) {
                mostRepeatedWords.add(wordInBox.getKey());
            }
        }
        System.out.println("most repeated words " + mostRepeatedWords);
    }

    @Test
    static void encuentraLasPalabrasQueMasSeRepiten() {
        String text = "hola, como, estas, que te pasa, estas bien,y tu";

        text = text.toLowerCase().replaceAll("[^A-Z a-z]", " ").replaceAll("\\s+", " ");
        System.out.println(text);
        String[] words = text.split(" ");

        Map<String, Integer> wordBox = new HashMap<>();
        int maxFrequency = 0;
        for (String word : words) {
            int frequency = wordBox.getOrDefault(word, 0) + 1;
            wordBox.put(word, frequency);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }
        List<String> mostRepeatedWords = new ArrayList<>();
        for (Map.Entry<String, Integer> wordFrequencyPair : wordBox.entrySet()) {
                if (wordFrequencyPair.getValue() == maxFrequency){
                    mostRepeatedWords.add(wordFrequencyPair.getKey());
                }
        }
        System.out.println("repeated words are: " + mostRepeatedWords);
    }
}
