package DAY47.ConditionalStatementsPractice;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        // Create Scanner to read User Input
        Scanner scanner = new Scanner(System.in);

        // Number input
        System.out.println("Enter a number greater than 212: ");

        // The number provided by the user will be assigned to the tempF variable
        // Scanner will read the input
        double tempF = Double.valueOf(scanner.nextLine());

        // if conditional statement that checks if input is greater than or equal to 212
        if (tempF >= 212) {
            System.out.println("Water is boiling!");
        } else {
            System.out.println("Please enter a value greater than 212.");
        }
    }
}
