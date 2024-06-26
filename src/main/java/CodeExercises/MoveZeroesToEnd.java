package CodeExercises;

import org.testng.annotations.Test;

public class MoveZeroesToEnd {

    @Test
    static void moveZeroesToEnd() {
        //  Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
        //  Note that you must do this in-place without making a copy of the array.
        //   Input: nums = [0,1,0,3,12]
        //  Output: [1,3,12,0,0]

        int[] arr = {0, 1, 0, 3, 12};
        int arraySize = arr.length;
        int count = 0;
        for (int i = 0; i < arraySize; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
                System.out.println("count " + count);
            }

        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("n: " + arraySize);

        while (count < arraySize)
            arr[count++] = 0;

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
