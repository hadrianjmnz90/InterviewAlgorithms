package CodeExercises;

import org.testng.annotations.Test;

import java.util.*;

public class RemoveDuplicatedNumbersMethods {

    @Test
    static void removeDuplicatedNumbersFromListUsingSet() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9));
        Set<Integer> numbersNoDuplicates = new HashSet<>();
        for (Integer number : numbers) {
            numbersNoDuplicates.add(number);
        }
        System.out.println(numbersNoDuplicates);
    }

    @Test
    static void removeDuplicateNumbersUsingArrayList() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7));
        ArrayList<Integer> numbersNoDuplicates = new ArrayList<>();
        for (Integer number : numbers) {
            if (!numbersNoDuplicates.contains(number)) {
                numbersNoDuplicates.add(number);
            }
        }
        System.out.println(numbersNoDuplicates);
    }

    @Test
    static void removeDuplicatedNumbersFromLinkedListUsingSet() {
        List<Integer> numbers = new LinkedList<>(Arrays.asList(1, 1, 1, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9));
        Set<Integer> numbersNoDuplicates = new HashSet<>();
        for (Integer number : numbers) {
            numbersNoDuplicates.add(number);
        }
        System.out.println(numbersNoDuplicates);
    }

    @Test
    public static void testCode() {
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);
        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8, 9]
            (Order may be different as sets are unordered)
        */
    }

    public static List<Integer> removeDuplicates(List<Integer> listOfNumbers) {
        Set<Integer> duplicateRemover = new TreeSet<>(listOfNumbers);
        return new ArrayList<>(duplicateRemover);
    }
}
