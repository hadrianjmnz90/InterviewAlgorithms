package CodeExercises;

import org.testng.annotations.Test;

public class AddWithoutPlusSign {
@Test
    static void testAddWithoutPlus() {
        int a = 5;
        int b = 7;
        int sum = addWithoutPlus(a, b);
        System.out.println("Sum: " + sum);
    }

    public static int addWithoutPlus(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            System.out.println(carry);
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
