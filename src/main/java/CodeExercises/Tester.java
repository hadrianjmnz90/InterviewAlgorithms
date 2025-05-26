package CodeExercises;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Tester {

    @Test
    static void randomCodeChallenge() {
        String[] codeChallenges = {
                "1. ENCUENTRA SI LA PALABRA DADA ES PALINDROMO\n",
                "2. BUSCAR LA PALABRA MAS REPETIDA EN UN TEXTO\n",
                "3. ENCONTRAR EL NUMERO QUE MAS SE REPITE EN UN ARREGLO\n",
                "4. NUMERO MAS GRANDE DE UN ARREGLO\n",
                "5. FACTORIAL\n",
                "6. NUMERO PRIMO\n",
                "7. LA DIFERENCIA MAX O MIN ENTRE LOS ELEMENTOS DE UN ARRAY\n",
                "8. FIBONACCI \n",
                "9. SWAP THE VALUES WITH AND WITHOUT TEMP VARIABLE\n",
                "10. PRINT UNIQUE NUMBERS/LETTERS VALUES IN ARRAY\n",
                "11. CONTAR LAS VECES QUE SE REPITE UN CARACTER EN UNA PALABRA //se puede usar hashmap, un for/if o filter\n",
                "12. DADO UN ARREGLO DE NUMEROS Y UN TARGET, DAME LOS INDICES DE LOS NUMEROS QUE SUMAN ESE TARGET ASUMIENDO QUE SIEMPRE HABRA UNA SOLUCION\n",
                "13. REVERSE A NUMBER / REVERSE A WORD\n",
                "14. SUMAR TODOS LOS ELEMENTOS DE  UN ARRAY\n",
                "15. CONTAR LAS VECES QUE SE REPITE UNA PALABRA EN UN TEXTO \n",
                "16. ORDENAR UN ARRAY ASC O DESC // no creo pregunten porque la implementacion mas facil es de burbuja pero no es eficiente\n",
                "17. ENCUENTRA LOS NUMEROS REPETIDOS EN DOS ARRAYS\n",
                "18. DEVUELVE EL NUMERO QUE NO SE REPITE EN UN ARREGLO, LOS DEMAS NUMEROS SE REPITEN UNA VEZ\n",
                "19. DADO UN ARREGLO DE NUMEROS O PALABRAS, DEVUELVE EL ARREGLO QUITANDO LOS NUMEROS O PALABRAS QUE SE REPITEN\n",
                "20. ORDENA UNA LISTA DE PALABRAS ",
                "21. DADO UN ARREGLO, DEVUELVE UNA LISTA O ARREGLO QUE CONTENGA UNICAMENTE LOS NUMEROS REPETIDOS",
                "22. compare same indexes of 2 different arrays and create a new array for matching values"};

        Random random = new Random();
        int indiceAleatorio = random.nextInt(codeChallenges.length);
        System.out.println(codeChallenges[indiceAleatorio]);
    }

    //factorial de 0 a 10......1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800 // multiply every number before the number !5 = 5x4x3x2x1
    // fibo....... 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, … //la suma de los 2 numeros anteriores por ejemplo 8 = 5+3 ; el siguiente seria 8 + 5 = 13
    //primos> 2, 3, 5, 7, 11, 13, 17, 19   //solo son divisibles entre si y la unidad en un numero entero > greaters than 1
    @Test
    static void testCode() {
        //    DADO UN ARREGLO DE NUMEROS Y UN TARGET, DAME LOS INDICES DE LOS NUMEROS
        //    QUE SUMAN ESE TARGET ASUMIENDO QUE SIEMPRE HABRA UNA SOLUCION\n",
        String[] words = {"banana", "apple", "coconut", "strawberry", "orange",
                "coconut", "strawberry", "orange"};
        String text = "el arbol tiene frutas, las frutas son buenas, las frutas rojas son mejores, las frutas verdes";
        int[] numbers = {4,3,2,1};
          char[] letters = {'a','a','c','b','b','a'};

        System.out.println(findIndexesOfNumbersThatAddToTarget(numbers, 4)[0]);
        System.out.println(findIndexesOfNumbersThatAddToTarget(numbers, 4)[1]);

    }
    static int [] findIndexesOfNumbersThatAddToTarget(int  [] numbers, int target) {
        HashMap<Integer, Integer> complementMap = new HashMap<>();
        for (int i = 0; i < numbers.length ; i++) {
            int complement = target - numbers[i];
            if (complementMap.containsKey(complement)){
                return new int [] {complementMap.get(complement), i};
            }
            complementMap.put(numbers[i], i);
        }
        return new int[]{};
    }

    static long countWithFilter(String word, char target){
        return word.chars().filter(ch -> ch == target).count();
    }

    static long countNumberWithFilter(int [] numbers, int target){
      return Arrays.stream(numbers).filter(n -> n == target).count();
    }
}















