package CodeExercises;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumAllElementsOfArray {

    @Test
    static void testSumOfAllElements(){
        int [] array1 = {1,2,3,5,10};
        Assert.assertEquals(sumAllElementsOfArray(array1), 21);
    //    Assert.assertFalse(sumAllElementsOfArray(array1) == 5);
    //    Assert.assertEquals(sumAllElementsOfArray(array1), 5);
    }

    static int sumAllElementsOfArray(int[] numbers){
        int result = 0;
        for ( int number : numbers) {
            result += number;
        }
        System.out.println("result: " + result);
        return result;
    }
}
