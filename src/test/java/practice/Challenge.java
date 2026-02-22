package practice;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Challenge {
    @Test
    public void getFirstNPrimeNumbers() {
        int counter = 0;
        List<Integer> firstNPrimeNumbers = new ArrayList<>();
        for (int i = 2; i > 0; i++) {

            if (isItPrimeNumber(i)) {
                counter++;
                firstNPrimeNumbers.add(i);
            }
            if (counter == 10) {
                break;
            }
        }
        System.out.println(firstNPrimeNumbers);
    }

    public boolean isItPrimeNumber(int target) {
        for (int i = 2; i <= target / 2; i++) {
            if (target % i == 0) {
                return false;
            }

        }
        return true;
    }
}