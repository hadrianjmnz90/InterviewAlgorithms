package CodeExercises;

import org.testng.annotations.Test;

import java.util.HashMap;

public class CalculateIndexesOfNumbersThatAddToTarget {

    @Test
    static void testCalculate(){
        int[] numbers = {2, 4, 5, 8, 10, 6};
        int target = 14;
        int [] result = calculateIndexesOfTarget(numbers, target);
        System.out.println(result[0]+ ", " + result[1]);
    }

    static int[] calculateIndexesOfTarget(int[] numbers, int target) {
        HashMap<Integer, Integer> complementMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (complementMap.containsKey(complement)) {
                // If found, return the indexes of the two numbers
                return new int[]{complementMap.get(complement), i};
            }
            // Otherwise, add the current number and its index to the HashMap
            complementMap.put(numbers[i], i);
        }
        // If no solution is found, return an empty array or null to indicate no solution
        return new int[0];
    }
}
