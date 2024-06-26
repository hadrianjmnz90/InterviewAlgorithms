package CodeExercises;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int[] indexes = {};
        Map<Integer, Integer> numbersMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (numbersMap.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[]{numbersMap.get(complement), i};
            }
            // Add the current number and its index to the map
            numbersMap.put(numbers[i], i);
        }
        for (Map.Entry<Integer, Integer> entry : numbersMap.entrySet()) {
            System.out.println(entry.getKey() + "= " + entry.getValue());
        }

        return indexes;
    }

    @Test
    public static void testCode() {
    //    System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9))); // 0,1
        //    System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6))); //1,2
        //   System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
           System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        //  System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        //  System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        //  System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));
        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []
        */

    }
}
