package DAY47.ScannerAssignment;

import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
        // Create the scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Print First Question
        System.out.println("Hello there! How are you doing today?");

        // The string provided by the user will be assigned to the text variable
        // Scanner will read the input entered by the user
        String text = scanner.nextLine();

        // Print the Second Question
        System.out.println("Wow - Interesting! Tell me more!");

        // The String provided by the user will be assigned to the text2 variable
        String text2 = scanner.nextLine();

        // Print a goodbye message!
        System.out.println("Nice chatting with you! Goodbye!");
    }
}