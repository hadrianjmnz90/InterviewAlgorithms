package CodeExercises;

import org.testng.annotations.Test;

import java.util.*;

public class FindRepeatedNumbersMethods {

    @Test
    static void findRepeatedNumbersWithSetForLoopSortFirst() {
        int[] numbers = {1, 2, 3, 1, 3, 4, 5, 6, 7, 5, 1};
        Arrays.sort(numbers);
        Set<Integer> numberList = new HashSet<>(); //we need this to remove any duplicated repeated values
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                numberList.add(numbers[i]);
            }
        }
        System.out.println("repeated numbers are: " + numberList);

    }

    @Test
    static void findMostRepeatedNumbersInArrayUseHashMap() {
        int[] numbers = {7, 1, 2, 3, 4, 4, 5, 6, 7, 8};
        int maxFreq = 0;
        Map<Integer, Integer> numberBox = new HashMap<>();

        for (int number : numbers) {
            int frequency = numberBox.getOrDefault(number, 0) + 1;
            numberBox.put(number, frequency);
            if (frequency > maxFreq) {
                maxFreq = frequency;
            }
        }
        System.out.println(numberBox);
        List<Integer> mostRepeatedNumbersList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> numberEntry : numberBox.entrySet()) {
            if (numberEntry.getValue() == maxFreq) {
                System.out.println(numberEntry.getKey());
                mostRepeatedNumbersList.add(numberEntry.getKey());
            }
        }
        System.out.println("most repeated numbers: " + mostRepeatedNumbersList);
    }

    @Test
    static void testCode() {
          int[] nums = {1, 2, 3, 2, 1, 4, 5, 4}; // output[1, 2, 4]
        //int[] nums = {1, 2, 3, 4, 5}; // output[]
     //   int[] nums = {3, 3, 3, 3, 3}; // Output: [3]
    //    int[] nums = {-1, 0, 1, 0, -1, -1, 2, 2}; //Output: [-1, 0, 2]
     //   int[] nums = {}; //Output: []\
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicateNumbers = new ArrayList<>();
        HashMap<Integer, Integer> numberCounts = new HashMap<>();

        for (int num : nums) {
            numberCounts.put(num, numberCounts.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numberCounts.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateNumbers.add(entry.getKey());
            }
        }
        return duplicateNumbers;
    }

}
