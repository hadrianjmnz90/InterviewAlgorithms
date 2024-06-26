package CodeExercises;

import org.testng.annotations.Test;

import java.util.HashSet;

public class FindFirstRecurringNumberInArray {

    @Test
    static void testFirstReocurringNumber(){
        //Given an array = [2,5,1,2,3,5,1,2,4]: It should return 2
        int[] array = {2, 5, 1, 2, 3, 5, 1, 2, 4};
        System.out.println(firstRecurringNumberInArray(array));
//Given an array = [2,1,1,2,3,5,1,2,4]: It should return 1
//Given an array = [2,3,4,5]: It should return null
    }

    static Integer firstRecurringNumberInArray(int [] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int element : array) {
            if (hashSet.contains(element)) {
                return element;
            } else {
                hashSet.add(element);
            }
        }
        return null;
    }
}
