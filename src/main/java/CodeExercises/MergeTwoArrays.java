package CodeExercises;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeTwoArrays {

    @Test
    static void testMergeTwoArrays(){
        int [] array1 = {7,8,9,3};
        int [] array2 = {4,5,6};
        mergeTwoArrays(array1, array2);
    }
    static void mergeTwoArrays( int [] array1, int [] array2 ) {
        int totalSize = array1.length + array2.length;
        int[] mergedArray = new int[totalSize];

        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            mergedArray[i + array1.length] = array2[i];
        }

        Arrays.sort(mergedArray);
        for (int n : mergedArray) {
            System.out.print (n);
        }
    }
}
