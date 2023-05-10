package DAY47.PracticingLoops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        // Create Scanner to read User Input
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.println("Enter a number: ");

        // The number provided by the user will be assigned to the userNum variable
        // Scanner will read the input
        int userNum = Integer.valueOf(scanner.nextLine());

        System.out.println("You entered the number: " + userNum);

        for (int i = 1; i < 11; i++) {
            int timesI = userNum * i;
            System.out.println(userNum + " x " + i + " = " + timesI);
        }
    }
}
