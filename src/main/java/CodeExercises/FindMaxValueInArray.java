package CodeExercises;

import org.testng.annotations.Test;

import java.util.Arrays;

public class FindMaxValueInArray {

    @Test
    static void findMaxValueInArray(){
        int [] numbers = {10, 45, 1, 5, 20, 3, 8};
        Arrays.sort(numbers);
        System.out.println("max value: " + numbers[numbers.length-1]);
    }

    @Test
    static void findMaxValueInArrayWithLoop(){
        int [] numbers = {-10, 100,10, 45, 1, 5, 20, -200, 3, 8,0};
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] >  maxValue){
                maxValue = numbers[i];
            }
        }
        System.out.println("max value: " + maxValue);
    }
}
