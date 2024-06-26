package CodeExercises;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PalindromeMethods {

    @Test
    public static void palindromeExtractor() {
        String text = "A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward. such as wataw";
        List<String> palindromes = extractPalindromes(text);
        System.out.println("Palindromes in the text:");
        for (String palindrome : palindromes) {
            System.out.println(palindrome);
        }
    }
    public static List<String> extractPalindromes(String text) {
        List<String> palindromes = new ArrayList<>();
        text = text.replaceAll(",", "").trim(); // Remove commas and leading/trailing spaces
        String[] words = text.split("\\s+"); // Split by whitespace
        for (String word : words) {
            if (!word.isEmpty() && isPalindrome(word)) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    @Test
    static void testIsWordPalindrome(){
        Assert.assertTrue(isWordPalindrome("a la gorda drogala"));
        Assert.assertFalse(isWordPalindrome("hola como estas"));
        Assert.assertFalse(isWordPalindrome("anita lava la tina"));
    }

    static boolean isWordPalindrome(String word){
        word = word.replaceAll(" ", "");
        System.out.println(word);
        String tempWord = "";
        for (int i = word.length() -1; i >=0 ; i--) {
            tempWord = tempWord + word.charAt(i);
        }
        System.out.println(tempWord);
        return word.equalsIgnoreCase(tempWord);
    }



}