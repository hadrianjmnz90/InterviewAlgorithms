package CodeExercises;

import org.testng.annotations.Test;

public class FindTwoMaxNumbersInArray {

    @Test
    static void findTwoMaxValuesInArray() {
        int[] numbers = {15, 24, 48, 21, 43, 11, 79, 93};
        int maxOne = 0;
        int maxTwo = 0;
        for (int n : numbers) {
            if (maxOne < n) {
                maxTwo = maxOne;
                maxOne = n;
            } else if (maxTwo < n) {
                maxTwo = n;
            }

        }
        System.out.println("Max1 - " + maxOne);
        System.out.println("Max2 - " + maxTwo);
    }
}
