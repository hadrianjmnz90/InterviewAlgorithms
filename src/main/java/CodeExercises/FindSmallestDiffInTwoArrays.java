package CodeExercises;

import org.testng.annotations.Test;

import java.util.Arrays;

public class FindSmallestDiffInTwoArrays {

    public static int calculateSmallestDifference(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int smallestDifference = Integer.MAX_VALUE;
        int i = 0, j = 0;

        while (i < array1.length && j < array2.length) {
            int difference = Math.abs(array1[i] - array2[j]);
            smallestDifference = Math.min(smallestDifference, difference);

            if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return smallestDifference;
    }

    @Test
    public static void testSmallestDifference() {
        int[] array1 = {1, 3, 15, 11, 2};
        int[] array2 = {23, 127, 235, 19, 8};

        int smallestDifference = calculateSmallestDifference(array1, array2);
        System.out.println("Smallest Difference: " + smallestDifference);
    }
}
