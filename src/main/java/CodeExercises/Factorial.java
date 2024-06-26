package CodeExercises;

import org.testng.annotations.Test;

public class Factorial {
//Factorial de 10 (denotado como 10!) = 10 × 9 × 8 × 7 × 6 × 5 × 4 × 3 × 2 × 1
    // en resumen es multiplicar todos los numeros del número

    // este metodo es mas eficiente
    @Test
    static void pruebaFactorial(){
        int target = 8;
        int factorial = 1;
        for (int i = 1; i <= target ; i++) {
            //  factorial = factorial * i;
            factorial *=  i;
        }
        System.out.println(factorial);
    }

    @Test
    static void factorial() {
        int number = 6, factorial = 1;
        for (int i = 1; i < number; i++) {
            factorial += factorial * i;
            //   factorial = factorial + (factorial * i); es lo mismo
        }
        System.out.printf("el factorial de %d es %d", number, factorial);
    }



}
