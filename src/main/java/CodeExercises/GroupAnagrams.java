package CodeExercises;

import org.testng.annotations.Test;

import java.util.*;

public class GroupAnagrams {

    @Test
    public static void testCde() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new ArrayList<>();
        }
        // Create a map where the key is the sorted string and the value is a list of anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : strings) {
            // Convert string to a char array, sort it, and then convert it back to a string
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            // Add the original string to the map
            if (!anagramMap.containsKey(sortedString)) {
                anagramMap.put(sortedString, new ArrayList<>());
            }
            anagramMap.get(sortedString).add(word);
        }

        // Return the values of the map as a list of lists
        return new ArrayList<>(anagramMap.values());
    }
}
