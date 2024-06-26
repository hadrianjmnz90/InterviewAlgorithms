package CodeExercises;

import org.testng.annotations.Test;

public class ReverseNumberMethods {

    @Test
    static void reverseNumberWithWhileLoop() {
        int number = 12345;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; //1234 and 5 remain or 1234.5
            reversedNumber = digit + reversedNumber * 10;
            number = number / 10; // or 1234 ya que como es un int no guarda los decimales el .5
        }
        System.out.println("Reversed number: " + reversedNumber);
    }

    // % remainder operator, te devuelve cuanto sobra de una division por ejemplo de 10 % 3 el remainder es de 1

    @Test
    static void reverseNumber() {
        int number = 1234;
        int reversed = 0;
        //primer paso seria dividir entre 10 para que nos de el resto

        while (number != 0){
            int digit = number % 10;
            reversed = digit + reversed * 10;
            number = number / 10;
        }

        System.out.println(reversed);
    }

}
