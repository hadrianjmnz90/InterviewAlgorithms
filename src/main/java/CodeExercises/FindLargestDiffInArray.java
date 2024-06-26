package CodeExercises;

import org.testng.annotations.Test;

import java.util.Arrays;

public class FindLargestDiffInArray {

    //assuming the question is largest difference in adjacent array, meaning items next to each other
    //{1,3,4,6,5,0,23,24,9} ANSWER 23 YA QUE ES LA DIF MAS GRANDE ENTRE 0 Y 23
    @Test
    static void findLargestDifferenceInArray() {
        int[] numbers = {3, 7, 8, 30, 15, 30, 50};
        int diff = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            int temp = numbers[i + 1] - numbers[i];
            System.out.println(temp);
            if (temp > diff) {
                diff = temp;
            }
        }
        System.out.println("largest difference: " + diff);
    }

    @Test
    static void testCode(){
        int [] numbers = {1,3,4,6,5,0,23,24,9};
        assert  findLargestDifferenceAdjacentArray(numbers ) == 23;
    }

    static int findLargestDifferenceAdjacentArray(int [] numbers){
        int maxDifference = 0;
        int temp;
        for (int i = 0; i < numbers.length - 1 ; i++) {
            temp = numbers[i + 1] - numbers[i];
            if (temp > maxDifference){
                maxDifference = temp;}
        }
        System.out.println(maxDifference);
        return maxDifference;
    }

    // assuming the objective is to find the largest difference, in all the elements, for example
    // the greatest item on the list minus the shortest element
    @Test
    static void findLargestDifferenceInArray2() {
        int[] numbers = {3, 7, 8, 30, 50, 15, 30};
        int diff = 0;
        Arrays.sort(numbers);

        diff = numbers[numbers.length - 1] - numbers[0];
        System.out.println("largest difference: " + diff);
    }
}
