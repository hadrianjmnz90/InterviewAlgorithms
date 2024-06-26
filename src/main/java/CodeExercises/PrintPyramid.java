package CodeExercises;

public class PrintPyramid {
    static void printPyramid() {
        int pyramidHeight = 5;
        for (int i = 0; i < pyramidHeight; i++) {
            for (int j = pyramidHeight - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
