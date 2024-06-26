package CodeExercises;

import org.testng.annotations.Test;

public class SwapMinMaxValueOfArray {
    @Test
    static void swapMinMaxValueOfArray() {
        int[] array = {2, 3, 6, 1, 4, 5, 5, 1, 9, 1, 13, 0};
        int min = array[0];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Before swapping: " + min + ", " + max);
        int temp = min;
        min = max;
        max = temp;
        System.out.println("swap: " + min + ", " + max);
    }
}
