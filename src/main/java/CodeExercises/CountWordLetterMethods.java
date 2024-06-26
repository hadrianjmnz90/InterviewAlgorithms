package CodeExercises;

import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWordLetterMethods {

    @Test
    static void countCharOccurrencesInArrayUsingFrequency() {
        String[] letters = {"a", "b", "c", "d", "a"};
        System.out.println(Collections.frequency(List.of(letters), "a"));
    }

    @Test
    static void countLettersInWordUsingFilter() {
        //same as find repeated chars in word
        String word = "elephant";
        long count = word.chars().filter(ch -> ch == 'e').count();
        System.out.println(count);
    }

    @Test
    static void countLettersInWordWithForLoop() {
        String word = "apple apple";
        char letter = 'p';
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("number of occurrences: " + count);
    }

    @Test
    static void contarVecesLetraRepetidaEnPalabra() {
        String word = "parangaricurimicuaro";
        char target = 'a';
        Map<Character, Integer> letterBox = new HashMap<>();
        for (char letter : word.toCharArray()) {
            int frequency = letterBox.getOrDefault(letter, 0) + 1;
            letterBox.put(letter, frequency);
        }

        System.out.println(letterBox);
        System.out.println("frequency of target. " + letterBox.get(target));
    }
}
