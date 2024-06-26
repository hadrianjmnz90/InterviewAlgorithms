package CodeExercises;

import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountOccurrencyOfNumberWithFrequency {

    @Test
    static void countNumberOccurrenceWithFrequency() {
        Integer[] numbers = {1, 1, 1, 2, 3, 4, 5, 1, 2, 5, 6, 7, 3};
        System.out.println(Collections.frequency(List.of(numbers), 1)); // prints occurrence of number 1 in the array
        System.out.println(".....................................");
        Set<Integer> setOfNumbers = new HashSet<>(List.of(numbers));
        for (Integer number : setOfNumbers) { // hashset no contiene duplicados
            System.out.println("number: " + number + " repeats " +
                    Collections.frequency(List.of(numbers), number) + " times"); //contamos la frequencia de la lista original NO del hashset
        }
    }
}
