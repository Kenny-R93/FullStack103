package DAY47.ConditionalStatementsPractice;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        // Create Scanner to read User Input
        Scanner scanner = new Scanner(System.in);

        // First Input
        System.out.println("Enter a number: ");

        // The number provided by the user will be assigned to the num1 variable
        // Scanner will read the input
        int num1 = Integer.valueOf(scanner.nextLine());

        // Second Input
        System.out.println("Enter another number: ");

        // The number provided by the user will be assigned to the num2 variable
        // Scanner will read the input
        int num2 = Integer.valueOf(scanner.nextLine());

        // if/else conditional statement
        if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else if (num1 > num2) {
            System.out.println("The first number is larger than the second number.");
        } else {
            System.out.println("The second number is larger than the first number.");
        }
    }
}
