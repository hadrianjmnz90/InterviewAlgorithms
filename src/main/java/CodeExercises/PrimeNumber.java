package CodeExercises;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeNumber {



    @Test
    static void testIsPrime() {
        Assert.assertFalse(findPrimeNumber(0));
        Assert.assertFalse(findPrimeNumber(1));
        Assert.assertTrue(findPrimeNumber(2));
        Assert.assertTrue(findPrimeNumber(3));
        Assert.assertTrue(findPrimeNumber(5));
        Assert.assertTrue(findPrimeNumber(29));
        Assert.assertFalse(findPrimeNumber(10));
    }

    static boolean findPrimeNumber(int number) {
        System.out.println("provided number " + number);
        if (number <= 1) {
            System.out.println("not prime");
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println("prime");
        return true;
    }

    @Test
    static void test(){
        System.out.println(7 / 2);
    }
}
