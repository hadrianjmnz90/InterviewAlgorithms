package CodeExercises;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortLettersOfWordWithArraysSort {

    @Test
    static String sortWordWithArraysSort(String word) {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }


}
