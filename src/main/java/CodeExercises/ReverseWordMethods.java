package CodeExercises;

import org.testng.annotations.Test;

import java.util.LinkedList;

public class ReverseWordMethods {

    @Test
    static void reverseWordWithForLoop() {
        String word = "hola";
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }
        System.out.println(reversedWord);
    }

    @Test
    static void reverseWordWithStringBuilder() {
        String word = "hola";
        StringBuilder reversedWord = new StringBuilder();
        System.out.println(reversedWord.append(word).reverse());
    }

    static void reverseWordGivenAsArrayOfChars() {
        char[] wordAsChars = {'H', 'e', 'l', 'l', 'o'};
        char[] reversedWord = new char[wordAsChars.length];
        int aux = 0;
        for (int i = wordAsChars.length - 1; i >= 0; i--) {
            reversedWord[aux] = wordAsChars[i];
            //    System.out.println(reversedWord);
            aux++;
        }
        System.out.println(reversedWord);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList) {
        System.out.println("before reversing: " + linkedList);
        LinkedList<String> revLinkedList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            // Append the elements in reverse order
            revLinkedList.add(linkedList.get(i));
        }
        // Return the reversed arraylist
        System.out.println(revLinkedList);
        return revLinkedList;
    }
}
