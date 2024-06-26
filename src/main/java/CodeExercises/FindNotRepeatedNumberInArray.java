package CodeExercises;

import org.testng.annotations.Test;

import java.util.*;

public class FindNotRepeatedNumberInArray {

    @Test
    static void findNonRepeatedNumber() {
        // Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
        // You must implement a solution with a linear runtime complexity and use only constant extra space.

        // Example 2:
        // Input: nums = [4,1,2,1,2]
        // Output: 4
        // Do XOR of all elements and return
        int[] numbers = {4, 1, 2, 1, 2};
        int res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            res = res ^ numbers[i];

        }
        System.out.println(res);
    }
    //  XOR (exclusive OR) is a bitwise operation in Java that returns true (1) if the corresponding bits of two operands are different,
//  and false (0) if they are the same.
//  XOR is often used to perform simple encryption, toggling bits, or checking for differences between binary values.

    @Test
    static void testXOR() {
        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011
        int result = a ^ b;  // Result: 0110 (6 in decimal)
        System.out.println(result);
    }

    @Test
    static void notRepeatedWithGetOrDefault(){
        int[] numbers = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 4, 33, 1, 23, 4};
        Map<Integer, Integer> boxOfNumbers = new HashMap<>();

        // Count occurrences of each number
        for (int number : numbers) {
            boxOfNumbers.put(number, boxOfNumbers.getOrDefault(number, 0) + 1);
        }

        // Find unique values
        System.out.print("Unique values: ");
        for (Map.Entry<Integer, Integer> entry : boxOfNumbers.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }

    @Test
    static void findUniqueValuesWithFrequency() {
        int[] numbers = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 4, 33, 1, 23, 4};
        List<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
        }

        System.out.print("Unique values: ");
        for (int number : numbers) {
            if (Collections.frequency(numberList, number) == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

}