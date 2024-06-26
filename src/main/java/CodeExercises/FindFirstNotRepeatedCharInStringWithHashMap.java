package CodeExercises;

import org.testng.annotations.Test;

import java.util.*;

public class FindFirstNotRepeatedCharInStringWithHashMap {

    @Test
    public static void testCode() {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null
        */

    }

    public static Character firstNonRepeatingChar(String word){
        Character firstNonRepeatingLetter = null;

        Map<Character, Integer> characterCounter = new LinkedHashMap<>(); // linkedhashmap keeps the elements in the order they are inserted

        for (Character letter : word.toCharArray()) {
            characterCounter.put(letter, characterCounter.getOrDefault(letter, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : characterCounter.entrySet()) {
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return firstNonRepeatingLetter;
    }
}
