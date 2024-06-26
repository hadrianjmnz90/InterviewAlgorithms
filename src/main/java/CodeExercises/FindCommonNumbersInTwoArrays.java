package CodeExercises;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindCommonNumbersInTwoArrays {

    @Test
    static void findCommonNumbers(){

        int [] array1 = {1,3,5,7,4,9,11,13};
        int [] array2= {2,4,6,8,10,12};

        for (int i = 0; i < array1.length ; i++) {
            for (int j = 0; j < array2.length ; j++) {
                if (array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }

    @Test
    static void findCommonNumbersWithSet() {
        int[] array1 = {1, 3, 5, 7, 4, 9};
        int[] array2 = {2, 4, 6, 8, 10, 12};
        Set<Integer> array1Copy = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();
        for (int number : array1) {
            array1Copy.add(number);
        }
        for (int number : array2) {
            if (array1Copy.contains(number)){
                commonElements.add(number);
            }
        }
        System.out.println("Common elements: " + commonElements);
    }

    @Test
    public void testCode(){
        int [] array1 = {3,5,6,2,4,1};
        //   int [] array2 = {30,50,60,2,40,10};
        int [] array2 = {3,50,60,20,40,10};
        System.out.println(itemInCommon(array1, array2));
    }

    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int item : array1) {
            map.put(item, true);
        }
        for (int item : array2) {
            if (map.containsKey(item)) {
                System.out.println("repeated number: " + item);
                return true;
            }
        }
        return false;
    }
}
