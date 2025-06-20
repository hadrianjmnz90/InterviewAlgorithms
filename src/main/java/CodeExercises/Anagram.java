package CodeExercises;

import java.util.HashMap;

public class Anagram {

    public boolean isItAnagram(String word1, String word2) {
        //anagram
        if (word1 == null || word2 == null){
            return false;
        }

        String cleanedWord1 = word1.replaceAll("\\s", "").toLowerCase();
        System.out.println(cleanedWord1);
        String cleanedWord2 = word2.replaceAll("\\s", "").toLowerCase();
        System.out.println(cleanedWord2);

        if (cleanedWord1.length() != cleanedWord2.length()){
            System.out.println("words are not anagrams");
            return false;
        }

        HashMap<Character, Integer> letterCounterMap = new HashMap<>();
        for (char letter : cleanedWord1.toCharArray()){
            letterCounterMap.put(letter, letterCounterMap.getOrDefault(letter, 0) + 1 );
        }

        for (char letter : cleanedWord2.toCharArray()){
            letterCounterMap.put(letter, letterCounterMap.getOrDefault(letter, 0) -1 );
        }

        for (int count : letterCounterMap.values()){
            if (count != 0){
                return false;
            }
        }
        return true;
    }
}
