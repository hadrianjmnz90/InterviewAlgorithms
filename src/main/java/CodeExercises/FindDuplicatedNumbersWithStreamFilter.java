package CodeExercises;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicatedNumbersWithStreamFilter {
    @Test
    static void findDuplicatedNumbersWithStreamFilter() {
        Integer[] numbers = new Integer[]{1, 2, 1, 1, 3, 4, 5, 7, 7, 8, 9, 9};
        List<Integer> listInteger = Arrays.asList(numbers);
        listInteger.stream().filter(i -> Collections.frequency(listInteger, i) > 1).
                collect(Collectors.toSet()).forEach(System.out::println);

    }
}
