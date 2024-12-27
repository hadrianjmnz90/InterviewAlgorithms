package CodeExercises;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.IntStream;

public class Tester {

    @Test
    static void randomCodeChallenge(){
        String [] codeChallenges = {
                "1. PALINDROMO\n",
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

    //factorial de 0 a 10......1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
    // fibo....... 0: 0, 1: 1, 2: 1, 3: 2, 4: 3, 5: 5, 6: 8, 7: 13, 8: 21, 9: 34, 10: 55
    //primos> 2, 3, 5, 7, 11, 13, 17, 19
    @Test
    static void testCode() {
   //     10. PRINT UNIQUE NUMBERS/LETTERS VALUES IN ARRAY
        int [] numbers = {5,5,5,3,3,4,1,1,2,9,9};
       for (int n : testGetUniqueNumbers(numbers)){
           System.out.println(n);
       }

        int [] numbers2 = {};
        for (int n : testGetUniqueNumbers(numbers2)){
            System.out.println(n);
        }
    }

    static List<Integer> testGetUniqueNumbers(int [] numbers) {

        if (numbers == null || numbers.length == 0){
            return new ArrayList<>();
        }

        HashMap<Integer, Integer>  numberCounter = new HashMap<>();
       List<Integer> uniqueList = new ArrayList<>();
        for (int number : numbers){
            numberCounter.put(number, numberCounter.getOrDefault(number, 0) +1);
        }

        for (Map.Entry<Integer, Integer> entry : numberCounter.entrySet()  ){
            if (entry.getValue() == 1){
                uniqueList.add(entry.getKey());
            }
        }
        return uniqueList;
    }


}















