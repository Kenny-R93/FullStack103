package DAY47.ConditionalStatementsPractice;

import java.util.Scanner;
public class SameOrNah {
    public static void main(String[] args) {
        // Create Scanner to read User Input
        Scanner scanner = new Scanner(System.in);

        // First input
        System.out.println("Enter a word:");

        // The number provided by the user will be assigned to the wordOne ariable
        // Scanner will read the input
        String wordOne = scanner.nextLine();

        // Second input
        System.out.println("Enter another word:");

        // The number provided by the user will be assigned to the wordTwo variable
        // Scanner will read the input
        String wordTwo = scanner.nextLine();

        // add IgnoreCase method so that the lower/uppercase letters are ignored
        // if/else conditional statement
        if (wordOne.equalsIgnoreCase(wordTwo)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}
