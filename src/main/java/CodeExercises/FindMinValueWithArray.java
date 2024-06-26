package CodeExercises;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinValueWithArray {

    public static void main(String[] args) {
        int size = readInteger();
        System.out.println("-".repeat(20));
        int[] elements = readElements(size);
        System.out.println("-".repeat(20));
        System.out.println(Arrays.toString(elements));
        System.out.println(  findMin(elements));
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.print("That's not a valid integer. Please enter an integer: ");
            scanner.next(); // clear the invalid input
        }
        int number = scanner.nextInt();
        return number;
    }

    private static int[] readElements(int numberOfElements) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[numberOfElements];
        for (int i = 0; i < elements.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("That's not a valid integer. Please enter an integer: ");
                scanner.next(); // clear the invalid input
            }
            int number =   scanner.nextInt();
            elements[i] = number;
            }
        return elements;
    }

    private static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int minValue = array[0];
        for (int value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

}
