package CodeExercises;

import org.testng.annotations.Test;

public class Fibonacci {

    static int stepCounter;
    //la secuencia fibonnacci se calcula empezando con 1,1 y se va sumando el numero anterior por ejemplo
    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
    // es decir 1 + 1 = 2 luego 1 + 2 = 3, 3 + 2 = 5, 5 + 3 = 8 y el primer numero es el fibo de 1, el segundo el fibo de 2 etc
    // fibonnaccis:  1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
    // numero      : 1, 2, 3, 4, 5, 6,  7, 8,   9, 10, 11

    @Test
    static void findFibonacci() {
        int number = 3;
        int a = 0, b = 1;
        for (int i = 0; i < number; i++) {
            a = a + b;
            b = a - b;
        }
        System.out.println("Fibo of " + number + " is: " + a);
    }

    @Test
    static void calcularFibo(){
        int a = 0, b = 1;
        int number = 11;
        for (int i = 0; i <number ; i++) {
            a = a + b;
            b = a - b;
        }
        System.out.println("fibo: " + a);
    }

    @Test
    static void testFibonacciDinamic() {
        int n = 20; // Fibonacci of 20
        int result = fibonacciDynamic(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
        System.out.println("Number of steps: " + stepCounter);
    }

    static int fibonacciDynamic(int n) {
        int[] cache = new int[n + 1];
        return fibonacciDynamicWithCount(n, cache);
    }

    static int fibonacciDynamicWithCount(int n, int[] cache) {
        stepCounter++;
        if (cache[n] == 0) {
            if (n < 2) {
                cache[n] = n;
            } else {
                cache[n] = fibonacciDynamicWithCount(n - 1, cache) + fibonacciDynamicWithCount(n - 2, cache);
            }
        }
        return cache[n];
    }

    // Recursive method
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Number of terms
        int a = 0, b = 1;

        System.out.print(a + " " + b); // Print the first two terms

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}
