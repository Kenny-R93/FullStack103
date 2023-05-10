package DAY47.PracticingLoops;

import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        // Create Scanner to read User Input
        Scanner scanner = new Scanner(System.in);

        // while conditional statement
        while (true) {
            System.out.println("Give a number: ");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 5) {
                break;
            }
        }
    }
}
