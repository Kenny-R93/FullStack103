package DAY47;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        // Create Scanner to read User Input
        Scanner scanner = new Scanner(System.in);

        // Number input
        System.out.println("Name a number between 0 and 100");

        // The number provided by the user will be assigned to the grade variable
        // Scanner will read the input
        int grade = Integer.valueOf(scanner.nextLine());

        if (grade >= 0 && grade < 60) {
            System.out.println("Your grade is an F");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("Your grade is a D");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("Your grade is a C");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Your grade is a B");
        } else {
            System.out.println("Your grade is an A");
        }
    }
}