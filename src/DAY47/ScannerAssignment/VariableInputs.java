package DAY47.ScannerAssignment;

import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        // Create Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // First input
        System.out.println("Enter a string of text: ");

        // The string will e read and be assigned to the text variable
        // Scanner will read the input from the user
        String text = scanner.nextLine();


        // Second input
        System.out.println("Enter an integer: ");

        // The int will be read and be assigned to the int num variable
        // Scanner will read the input from the user
        int num = Integer.valueOf(scanner.nextLine());

        // Print the Second input
        System.out.println(num);

        // Third input
        System.out.println("Enter a double:");

        // The double will be read and be assigned to the decimalNum variable
        // Scanner will read the input
        double decimalNum = Double.valueOf(scanner.nextLine());

        // Print the Third input
        System.out.println(decimalNum);

        // Fourth input
        System.out.println("Enter a boolean value:");

        // The boolean will be read and be assigned to the TorF variable
        // Scanner will read the input
        boolean TorF = Boolean.valueOf(scanner.nextLine());

        // Print the Fourth input
        System.out.println(TorF);



    }
}
