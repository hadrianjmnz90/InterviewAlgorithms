package CodeExercises;

import java.util.Scanner;

public class EarningsPercentageCalculator {

    private static String format;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean userWantsToContinue = true;

        while (userWantsToContinue) {
            System.out.println("Enter initial stock value");
            double initialValue = getValidDouble(scanner);

            System.out.println("Enter final/sold stock value");
            double finalValue = scanner.nextDouble();

            System.out.println("Would you like to calculate the final return in dollars? (Yes/No):");
            String userResponse = scanner.next().toLowerCase();

            if (userResponse.equals("y")) {
                System.out.println("Enter the number of shares:");
                double numberOfShares = scanner.nextDouble();
                System.out.println("Result: " + "$" + String.format("%.2f", calculateEarningsPercentageWithNumberOfShares(initialValue, finalValue, numberOfShares)) + " (total earnings)");
                System.out.println("Result: " + String.format("%.2f", calculateEarningsPercentage(initialValue, finalValue)) + "%");
            } else {
                System.out.println("Result: " + String.format("%.2f", calculateEarningsPercentage(initialValue, finalValue)) + "%");
            }

            System.out.println("would you like to continue?...Press ANY KEY for Yes and N for NO");
            userResponse = scanner.next().toLowerCase();
            if (userResponse.equalsIgnoreCase("N")) {
                userWantsToContinue = false;
            }
        }
        scanner.close();
        System.out.println("Thanks for using our service, have a nice Day!!!");
    }

    static double calculateEarningsPercentage(double initialValue, double finalValue) {
        double earningsPercentage = ((finalValue - initialValue) / initialValue) * 100;
        return earningsPercentage;
    }

    static double calculateEarningsPercentageWithNumberOfShares(double initialValue, double finalValue, double numberOfShares) {
        return (finalValue-initialValue) * numberOfShares;
    }

    static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next(); // Consume the invalid input
        }
        return scanner.nextDouble();
    }


}
