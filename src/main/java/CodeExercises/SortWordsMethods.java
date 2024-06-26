package CodeExercises;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SortWordsMethods {

    @Test
    static void sortListOfWordsWithArraysSort() {
        String[] words = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                "aug", "Sep", "Oct", "nov", "Dec"};

        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        for (String word : words) {
            System.out.println(word);
        }
    }

    @Test
    static void sortWordsWithCollections() {
        String[] words = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                "aug", "Sep", "Oct", "nov", "Dec"};
        LinkedList<String> list = new LinkedList<>();
        for (String word : words) {
            list.add(word);
        }
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String w : list) {
            System.out.println(w);
        }
    }
}
