package CodeExercises;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Tester2 {
    //factorial de 0 a 10......1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
    // fibo....... 0: 0, 1: 1, 2: 1, 3: 2, 4: 3, 5: 5, 6: 8, 7: 13, 8: 21, 9: 34, 10: 55
    //primos> 2, 3, 5, 7, 11, 13, 17, 19
    @Test
    static void testCode() {
        //DEVUELVE EL NUMERO QUE NO SE REPITE EN UN ARREGLO, LOS DEMAS NUMEROS SE REPITEN UNA VEZ
        int[] numbs1 = {1, 3, 5, 7, 10};
        int[] numbs2 = {1, 33, 55, 7, 23};
        int[] numbs3 = {1, 2, 3, 4, 5, 5,4,2,1};
        String [] words = {"Gato", "pato", "Gorilla", "abeja", "Zorro", "panda"};
        sortListWord(words);

    }

    static void sortListWord(String [] words){

        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        System.out.println(Arrays.toString(words));
    }

}
