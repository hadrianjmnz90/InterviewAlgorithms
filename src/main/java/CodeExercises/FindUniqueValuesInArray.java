package CodeExercises;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueValuesInArray {

    @Test
    static void findUniqueValues(){
        int[] numbers = {1,2,3,4,5,1,2,3,4,6,1,2,3,4};
        Map<Integer, Integer> numberBox = new HashMap<>();
        for (int number : numbers) {
            int frequency = numberBox.getOrDefault(number, 0) + 1;
            numberBox.put(number, frequency);
        }

        System.out.println(numberBox);
        for (Map.Entry<Integer, Integer> entry: numberBox.entrySet()) {
            if (entry.getValue() == 1){
                System.out.println("unique values: " + entry.getKey());
            }
        }
    }
}
