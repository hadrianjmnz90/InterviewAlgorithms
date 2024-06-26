package CodeExercises;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Permutation {

    @Test
    static void testPermutation(){
        System.out.println( permutation("abc", "cabs"));
    }
    static boolean permutation(String word1, String word2) {
        //permutation: word contains the same letters as other in any order, for example abc, cba, bac, are permutations
        if (word1.length() != word2.length()) return false;
        return sortWordWithArraysSort(word1).equals(sortWordWithArraysSort(word2));
    }
    static String sortWordWithArraysSort(String word) {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }
}
