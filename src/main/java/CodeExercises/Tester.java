package CodeExercises;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.IntStream;

public class Tester {

    @Test
    static void randomCodeChallenge(){
        String [] codeChallenges = {"1. PALINDROMO\n",
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

    @Test
    static void testObtainPalindrome() {
        Assert.assertTrue(obtainPalindrome("anita lava la tina"));
        Assert.assertFalse(obtainPalindrome("cualquier otra cosa"));
        Assert.assertTrue(obtainPalindrome("a la gorda drogala"));
    }

    static boolean obtainPalindrome(String word) {
        word = word.trim().replaceAll(" ", "");
        System.out.println(word);
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        System.out.println(reversedWord);
        return word.equalsIgnoreCase(reversedWord);
    }

    @Test
    static void testFindMostRepeatedWordInText() {
        String text = "hola como estas, espero te encuentres bien, te quiero decir que, como";
        findMostRepeatedWordInText(text);
    }

    static List<String> findMostRepeatedWordInText(String text) {
        text = text.replaceAll(",", "").trim();
        List<String> mostRepeatedWords = new ArrayList<>();
        Map<String, Integer> wordCounter = new HashMap<>();
        int maxFrequency = 0;
        for (String word : text.split(" ")) {
            int wordFrequency = wordCounter.getOrDefault(word, 0) + 1;
            wordCounter.put(word, wordFrequency);
            if (wordFrequency > maxFrequency) {
                maxFrequency = wordFrequency;
            }
        }
        System.out.println(maxFrequency);

        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                mostRepeatedWords.add(entry.getKey());
            }
        }

        System.out.println(mostRepeatedWords);
        return mostRepeatedWords;
    }

    @Test
    static void testFindMostRepeatedNumber() {
        int[] numbers = {1, 1, 1, 2, 6, 4, 5, 6, 7, 4, 56, 2, 4, 4, 5, 6, 1, 6, 1, 4, 3, 4, 1};
        findMostRepeatedNumber(numbers);
    }

    static List<Integer> findMostRepeatedNumber(int[] numbers) {
        Map<Integer, Integer> numbersCount = new HashMap<>();
        int maxFrequency = 0;
        List<Integer> mostRepeatedNumbersList = new ArrayList<>();
        for (int number : numbers) {
            int frequency = numbersCount.getOrDefault(number, 0) + 1;
            numbersCount.put(number, frequency);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        for (Map.Entry<Integer, Integer> entry : numbersCount.entrySet()) {
            System.out.println("number: " + entry.getKey() + " repeats " + entry.getValue() + " times");
            if (entry.getValue() == maxFrequency) {
                mostRepeatedNumbersList.add(entry.getKey());
            }
        }
        System.out.println("most repeated numbers: " + mostRepeatedNumbersList);
        return mostRepeatedNumbersList;
    }

    @Test
    static void testFindHighestNumberInArray() {
        int[] numbers = {1, 5, 6, 3, 43, 23, 146, 357, 2, 47, 65};
        int[] numbers2 = {};
        findHighestNumberInArray(numbers);
        findHighestNumberInArray(numbers2);
    }

    static void findHighestNumberInArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("given array is null or empty");
        }
        //METODO USANDO ARRAYS.SORT
        int max = 0;
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 1]);
        //USANDO IntStream
        int maxN = IntStream.of(numbers).max().orElseThrow(() -> new RuntimeException("Array is empty"));
        System.out.println(maxN);

        //usando Arrays.stream
        int max2 = Arrays.stream(numbers).max().orElseThrow(() -> new RuntimeException("Array is empty"));

        //usando un for loop
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max: " + max);
    }

    @Test
    static void testCode() {
        List<String> names = new ArrayList<>(List.of("alpha", "bravo", "charlie"));

        names.forEach(n -> System.out.println(n));
        names.forEach(n -> {
            char letter = n.charAt(0);
            System.out.println(letter + " stands for : " + n);
        });

    }

    @Test
    static void testFactorial() {
        System.out.println(calculateFactorial(10));
        System.out.println(calculateFactorial(0));
        System.out.println(calculateFactorial(6));
    }

    static int calculateFactorial(int number) {
        if (number == 0) return 1;
        // 10*9*8
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @Test
    static void testIsPrimeNumber() {
        System.out.println(isPrimeNumber(0));
        System.out.println(isPrimeNumber(1));
        System.out.println(isPrimeNumber(2));
        System.out.println(isPrimeNumber(3));
        System.out.println(isPrimeNumber(4));
        System.out.println(isPrimeNumber(5));
        System.out.println(isPrimeNumber(6));
        System.out.println(isPrimeNumber(7));
    }

    static boolean isPrimeNumber(int number) {
        if (number < 2) return false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    @Test
    static void testFindMaxDifferenceInArray() {
        int[] numbers = {3, 6, 7, 3, 15, 12, 10, 4, 20};
        findMaxDifferenceInArray(numbers);
    }

    static void findMaxDifferenceInArray(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            int temp = numbers[i + 1] - numbers[i];
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(max);
    }

    @Test
    static void testFindFibonacci() {
        System.out.println(findFibonnacci(0)); //0
        System.out.println(findFibonnacci(1));//1
        System.out.println(findFibonnacci(2));//1
        System.out.println(findFibonnacci(3));//2
        System.out.println(findFibonnacci(4));//3
        System.out.println(findFibonnacci(5));//5
        System.out.println(findFibonnacci(6));//8
        System.out.println(findFibonnacci(7));//13
        System.out.println(findFibonnacci(8));//21
        System.out.println(findFibonnacci(9));//34
        System.out.println(findFibonnacci(10));//55
    }

    static int findFibonnacci(int number) {
        if (number == 0)
            return 0;
        if (number <= 2)
            return 1;
        int a = 0, b = 1;

        for (int i = 0; i < number; i++) {
            a = a + b;
            b = a - b;
        }
        return a;
    }

    @Test
    static void testSwapTheValues() {
        int[] values = {20, 30};
        System.out.println("before swapping " + values[0] + " " + values[1]);
        //   int[] expectedValues = {30, 20};
        //   Assert.assertEquals (swapTheValuesWithTempVar(values), expectedValues);
        //  Assert.assertEquals(swapTheValuesWithTempVar(values), new int[]{20, 30});
        swapTheValuesWithoutTempVar(values);

    }

    static int[] swapTheValuesWithTempVar(int[] values) {
        if (values == null)
            throw new IllegalArgumentException("array is null");

        if (values.length < 2)
            throw new IllegalArgumentException("array not valid");

        int temp = values[0];
        values[0] = values[1];
        values[1] = temp;
        System.out.println("after swapping" + values[0] + " " + values[1]);
        return values;
    }

    static int[] swapTheValuesWithoutTempVar(int[] values) {
        if (values == null)
            throw new IllegalArgumentException("array is null");

        if (values.length < 2)
            throw new IllegalArgumentException("array not valid");
        // 20, 30
        values[0] = values[0] + values[1]; // 50
        values[1] = values[0] - values[1]; //20
        values[0] = values[0] - values[1];


        System.out.println("after swapping " + Arrays.toString(values));
        return values;
    }

    @Test
    static void testFindUniqueNumbersInArray() {
        //1,1,2,3,3,4,5,5,6
        int[] numbers = {1, 1, 2, 3, 3, 4, 5, 5, 6};
        findUniqueNumbersInArray(numbers);
        findUniqueLettersInWord("Adrian");
    }

    static void findUniqueNumbersInArray(int[] numbers) {
        //return an array with unique numbers
        HashMap<Integer, Integer> numbersUnique = new HashMap<>();
        List<Integer> uniqueNumbersList = new ArrayList<>();

        for (int number : numbers) {
            int count = numbersUnique.getOrDefault(number, 0) + 1;
            numbersUnique.put(number, count);
        }
        for (Map.Entry<Integer, Integer> entry : numbersUnique.entrySet()) {
            System.out.println("number: " + entry.getKey() + " count: " + entry.getValue());
            if (entry.getValue() == 1) {
                uniqueNumbersList.add(entry.getKey());
            }
        }
        System.out.println("uniques<" + uniqueNumbersList);
    }

    static void findUniqueLettersInWord(String word) {
        word = word.toLowerCase().trim();
        Map<Character, Integer> letterFrequencyCounter = new HashMap<>();
        List<Character> uniqueLetters = new ArrayList<>();
        for (char letter : word.toCharArray()) {
            int frequency = letterFrequencyCounter.getOrDefault(letter, 0) + 1;
            letterFrequencyCounter.put(letter, frequency);
        }

        for (Map.Entry<Character, Integer> entry : letterFrequencyCounter.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueLetters.add(entry.getKey());
            }
        }
        System.out.println(uniqueLetters);
    }

    @Test
    static void testCountTimesWordIsRepeatedInText() {
        String text = "En un pequeño pueblo costero, la vida transcurría tranquila. Los habitantes disfrutaban de la brisa marina y de las vistas al océano. Cada mañana, los pescadores salían en sus barcos a buscar el mejor marisco, mientras los niños jugaban en la playa. Las casas, pintadas de vivos colores, formaban un cuadro pintoresco. Las tardes se llenaban de risas en la plaza central, donde todos se reunían para compartir historias y disfrutar de la compañía mutua. Los atardeceres eran un espectáculo de colores, cerrando cada día con una sensación de paz y felicidad. La vida en el pueblo era sencilla pero plena.";
        String target = "en";
        System.out.println("target repeats> " + countTimesWordIsRepeatedInText(text, target));
    }

    static int countTimesWordIsRepeatedInText(String text, String targetWord) {
        text = text.replaceAll("[^A-Za-z0-9ñÑáéíóúÁÉÍÓÚüÜ]", " ");
        String[] words = text.split("\\s+");
        HashMap<String, Integer> wordCounter = new HashMap<>();
        for (String word : words) {
            int frequency = wordCounter.getOrDefault(word, 0) + 1;
            wordCounter.put(word, frequency);
        }

        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        return wordCounter.get(targetWord);
    }

    @Test
    static void testCalculateIndexesOfSum() {
        //DADO UN ARREGLO DE NUMEROS Y UN TARGET, DAME LOS
        // INDICES DE LOS NUMEROS QUE SUMAN ESE TARGET ASUMIENDO QUE SIEMPRE HABRA UNA SOLUCION
        //  int[] numbers = {2, 4, 5, 8, 10, 1};
        int[] numbers = {2, 4, 5, 8, 10, 6};
        int target = 8;
        int[] result = calculateIndexesOfSum(numbers, target);
        if (result.length < 2) {
            System.out.println("no solution found");
        } else {
            System.out.println("solution: " + Arrays.toString(result));
        }
    }

    static int[] calculateIndexesOfSum(int[] numbers, int target) {
        HashMap<Integer, Integer> numberCounter = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (numberCounter.containsKey(complement)) {
                return new int[]{numberCounter.get(complement), i};
            }
            numberCounter.put(numbers[i], i);
        }
        return new int[0];
    }

    @Test
    static void testReverseANumber() {
        Assert.assertEquals(reverseANumber(12345), 5432);
    }

    static int reverseANumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = digit + reversedNumber * 10;
            number = number / 10;
        }
        System.out.println(reversedNumber);
        return reversedNumber;
    }

    @Test
    static void testSumAllArrayElements(){
        int [] array = {2,3,4,6,10,1};
        Assert.assertEquals(sumAllArrayElements(array), 25);
    }

    static int  sumAllArrayElements(int [] numbers){
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
        return sum;
    }

}















