package practice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.*;

public class Tester {

    @Test
    static void randomCodeChallenge() {
        String[] codeChallenges = {
                "1. ENCUENTRA SI LA PALABRA DADA ES PALINDROMO //USA STRINGBUILDER \n",
                "2. BUSCAR LA PALABRA MAS REPETIDA EN UN TEXTO\n",
                "3. ENCONTRAR EL NUMERO QUE MAS SE REPITE EN UN ARREGLO\n",
                "4. NUMERO MAS GRANDE DE UN ARREGLO // simple for loop\n",
                "5. FACTORIAL //multiplicar todos los numeros del numero //no empieza en 0\n",
                "6. NUMERO PRIMO\n",
                "7. LA DIFERENCIA MAX O MIN ENTRE LOS ELEMENTOS DE UN ARRAY --adyacentes Math.abs",
                "7.1 LA DIFERENCIA MAX O MIN ENTRE LOS ELEMENTOS DE UN ARRAY -- cualquier posicion -- min =MAX.VALUE, max=MIN.VALUE",
                "8. FIBONACCI //se va sumando los numeros anteriores es el de a=0, b=1 , a+b, a-b\n",
                "9. SWAP THE VALUES WITH AND WITHOUT TEMP VARIABLE\n",
                "10. PRINT UNIQUE NUMBERS/LETTERS VALUES IN ARRAY\n",
                "11. CONTAR LAS VECES QUE SE REPITE UN CARACTER EN UNA PALABRA //se puede usar hashmap, un for/if o filter\n",
                "12. CALCULATE INDEXES OF NUMBERS IN ARRAY THAT ADD TO TARGET," +
                        " ASUMIENDO QUE SIEMPRE HABRA UNA SOLUCION // COMPLEMENT MAP  ",
                "13. REVERSE A NUMBER - use while, 10 al final / REVERSE A WORD\n",
                "14. SUMAR TODOS LOS ELEMENTOS DE  UN ARRAY -- for loop n",
                "15. CONTAR LAS VECES QUE SE REPITE UNA PALABRA EN UN TEXTO \n",
                "16. FIND COMMON VALUES IN TWO ARRAYS -- use two sets en cualquier orden\n",
                "17. DEVUELVE EL NUMERO QUE NO SE REPITE EN UN ARREGLO, LOS DEMAS NUMEROS SE REPITEN UNA VEZ\n",
                "18. DADO UN ARREGLO DE NUMEROS O PALABRAS, DEVUELVE EL ARREGLO QUITANDO LOS NUMEROS O PALABRAS QUE SE REPITEN",
                "19. ORDENA UNA LISTA DE PALABRAS //no uses Arrays.sort,  a list y usar collections.sort " +
                        "ask if mayus position matters",
                "20. DADO UN ARREGLO, DEVUELVE UNA LISTA O ARREGLO QUE CONTENGA UNICAMENTE LOS NUMEROS REPETIDOS",
                "21. compare same indexes of 2 different arrays and create a new array for matching values // use Math.min " +
                        "//este ejercicio es si se compara el mismo indice y " +
                        "el otro ejercicio comparar los numeros en cualquier orden es el ejercicio 16 --usa SET ",
                "22. DADO UNA LISTA DE PALABRAS O NUMEROS QUITA LOS DUPLICADOS, EJEMPLO 1,2,2,1,4,6 DEVUELVE 1,2,4,6",
                "23 MERGE TWO ARRAYS",
                "24 MOST REPEATED NUMBER IN ARRAY",
                "25. FIND FIRST NON REPEATED CHAR IN STRING  - LINKEDHASHMAP KEEPS ELEMENTS IN INSERTION ORDER",
                "26. FIND TWO MAX NUMBERS IN ARRAY // no usar Arrays.sort por la eficiencia de O (n log n)",
                "27. ANAGRAM //different word same letters // count letters with one map use +1, -1 ",
                "28. Given a two digit number, return the sum of its two digits 44 = 8, use division and module",
                "29. ORDENAR UN ARRAY ASC O DESC // no creo pregunten porque la implementacion mas facil es de burbuja " +
                        "pero no es eficiente, se puede usar el metodo Arrays.sort\n"};

        Random random = new Random();
        int indiceAleatorio = random.nextInt(codeChallenges.length);
        System.out.println(codeChallenges[indiceAleatorio]);
    }

    //factorial de 0 a 10......1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800 // multiply every number before the number !5 = 5x4x3x2x1
    // fibo....... 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, … //la suma de los 2 numeros anteriores por ejemplo 8 = 5+3 ; el siguiente seria 8 + 5 = 13
    //primos> 2, 3, 5, 7, 11, 13, 17, 19   //solo son divisibles entre si y la unidad en un numero entero > greaters than 1
    @Test(dataProvider = "GameOptions")
    static void playRockPaperScissors(String player1, String player2, String result) {
        //method to choose winner
        // test the method with data providers
        // data providers method with combinations and result for example paper, scissors, p1 wins!
        Assert.assertEquals(chooseWinner(player1, player2), result);
    }

    static String chooseWinner(String player1, String player2) {
        if (player1 == null || player2 == null || isSelectionValid(player1) == false
                || isSelectionValid(player2) == false) return "Invalid Data!";
        if (player1.equals(player2)) return "Tie!";
        if ((player1.equals("Piedra") && player2.equals("Tijera"))
                || (player1.equals("Tijera") && player2.equals("Papel"))
                || (player1.equals("Papel") && player2.equals("Piedra"))) {
            return "Player 1 Wins!";
        }
        return "Player 2 Wins!";
    }

    static boolean isSelectionValid(String playerOption) {
        String[] options = {"Piedra", "Papel", "Tijera"};
        for (String option : options) {
            if (playerOption.equalsIgnoreCase(option)) {
                return true;
            }
        }
        return false;
    }

    @DataProvider(name = "GameOptions")
    public Object[][] gameTester() {
        return new Object[][]{
                {"Piedra", "Tijera", "Player 1 Wins!"},
                {"Papel", "Piedra", "Player 1 Wins!"},
                {"Tijera", "Papel", "Player 1 Wins!"},
                {"Tijera", "Tijera", "Tie!"},
                {"Papel", "Papel", "Tie!"},
                {"Piedra", "Piedra", "Tie!"},
                {"Piedra", "Papel", "Player 2 Wins!"},
                {"Papel", "Tijera", "Player 2 Wins!"},
                {"Tijera", "Piedra", "Player 2 Wins!"},
                {null, "Piedra", "Invalid Data!"},
                {null, null, "Invalid Data!"},
                {"Papel", null, "Invalid Data!"},
                {"Pedro", "Tijera", "Invalid Data!"},
                {"Elefante", "Piedra", "Invalid Data!"},
        };
    }


}















