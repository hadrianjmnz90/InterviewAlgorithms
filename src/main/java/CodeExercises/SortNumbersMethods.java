package CodeExercises;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class SortNumbersMethods {

    //bubble sort, recomendable para arreglos pequeños
    @Test
    static void sortArrayNumbersWithForLoopAsc() {
        int[] numbers = {15, 30, 35, 4, 1, 2, 19};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    static void sortNumbersAndFindLargestAndSmallest() {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(ThreadLocalRandom.current().nextInt(1, 100));
        }
        System.out.println("Before sorting list: " + numbers);
        Collections.sort(numbers);
        //   Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("smallest number in list: " + numbers.get(0));
        System.out.println("largest number in list: " + numbers.get(numbers.size() - 1));
    }

    @Test
    static void sortArrays() {
        int[] numbers = {6, 7, 24, 668, 24, 88, 223, 452, 134, 14};
        Integer[] numbers2 = {6, 7, 24, 668, 24, 88, 223, 452, 134, 14};
        Arrays.sort(numbers);
        Arrays.sort(numbers2, Comparator.reverseOrder());
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println(Arrays.toString(numbers2));
    }
}
