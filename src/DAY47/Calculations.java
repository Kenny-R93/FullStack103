package DAY47;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        // Create Scanner to read User Input
        Scanner scanner = new Scanner(System.in);

        // First Input
        System.out.println("Enter a number:");

        // The number will be read and be assigned to the input1 variable
        // Scanner will read the input from the user
        int num1 = Integer.valueOf(scanner.nextLine());

        // Second Input
        System.out.println("Enter another number: ");

        // The number will be read and be assigned to the input2 variable
        // Scanner will read the input from the user
        int num2= Integer.valueOf(scanner.nextLine());


        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        double division = Double.valueOf(num1) / Double.valueOf(num2);
        int modulus = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + modulus);
    }
}
