package DAY47.ScannerAssignment;

import java.util.Scanner;

public class Superhero {
    public static void main(String[] arg) {
        // Create the scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Print the questions about a superhero story
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story");

        // The string provided by the user will be assigned to the superhero variable
        // Scanner will read the input entered by the user
        String superhero = scanner.nextLine();

        // Print the First user's text that was entered
        System.out.println(superhero);

        // Print a question asking about the superhero's superpower
        System.out.println("What is their superpower?");

        // The string provided by the user will be assigned to the superpower variable
        // Scanner will read the input
        String superpower = scanner.nextLine();

        // Print out the superhero story based on users previous inputs
        System.out.println("Here is the story: ");
        System.out.println("There was once a superhero named " + superhero + ", who had the power of " + superpower + ".");
        System.out.println("As they grew older, " + superhero + " saw that the world needed them");
        System.out.println(superhero + " used theri ability to " + superpower + " to save the world.");



    }

}
