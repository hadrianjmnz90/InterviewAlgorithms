package CodeExercises;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class WordContainsUniqueCharsMethods {

    static boolean findIfWordContainsUniqueCharactersWithSet() {
        Set<Character> letterBox = new HashSet<>();
        String word = "person";
        for (int i = 0; i < word.length(); i++) {
            if (letterBox.contains(word.charAt(i))) {
                return false;
            }
            letterBox.add(word.charAt(i));
        }
        return true;
    }

    @Test
    public static void testCode() {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
       System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false
        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false
        */
    }

    public static boolean hasUniqueChars(String word) {
        Set<Character> unique = new HashSet<>();
        for (char letter : word.toCharArray()) {
            if (unique.contains(letter)) {
                return false;
            }
            unique.add(letter);
        }
        return true;
    }
}
