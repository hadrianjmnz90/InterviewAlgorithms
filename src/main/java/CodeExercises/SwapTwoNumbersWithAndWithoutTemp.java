package CodeExercises;

import org.testng.annotations.Test;

public class SwapTwoNumbersWithAndWithoutTemp {

    @Test
    static void swapTwoNumbersWithoutTempVariable() {
        int numX = 1;
        int numY = 2;
        System.out.println("Before Swapping: " + numX + " " + numY);
        numX = numX + numY;
        numY = numX - numY;
        numX = numX - numY;
        System.out.println("After Swapping " + numX + " " + numY);
    }

    @Test
    static void testSwap(){
        int x = 20;
        int y = 100;
       int [] values =  swapWithTempValue(x, y);
        System.out.println(values[0] + "....." + values[1]);
    }

    static int[]  swapWithTempValue(int number1, int number2) {
    //    System.out.println("before swapping: " + number1 + " " + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        int result [] = {number1, number2};
        return result;
     //   System.out.println("after swapping: " + number1 + "  " + number2);
    }
}
