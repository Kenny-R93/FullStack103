package DAY47;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Create the scanner for the reading user input
        Scanner scanner = new Scanner(System.in);

        // Print "What's your name?"
        System.out.println("What is your name?");

        // The string provided by the user will be assigned to the text variable
        // Scanner will read the input entered by the user
        String text = scanner.nextLine();

        // Print the user's text that was entered
        System.out.println("Hi " + text);
    }
}
