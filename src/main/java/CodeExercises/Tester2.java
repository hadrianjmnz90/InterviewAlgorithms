package CodeExercises;

import org.testng.annotations.Test;

import java.util.*;

public class Tester2 {
    //factorial de 0 a 10
    //1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
    @Test
    static void testCode() {
//3. ENCONTRAR EL NUMERO QUE MAS SE REPITE EN UN ARREGLO

        List<String> words = Arrays.asList("zorro", "rana", "abeja", "oso", "puma", "panda");
   //     orderWords(words);

        String [] words2 = {"zorro", "rana", "abeja", "oso", "puma", "panda", "Conejo", "cabra"};
        orderWords(words2);

    }

    static void orderWords(String []  words) {

   Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.asList(words));
    }


}
