package DAY47.PracticingLoops;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        // Create Scanner to read User Input
        Scanner scanner = new Scanner(System.in);

        // First Input
        System.out.println("Please enter a number less than 11.");

        // The number provided by the user will be assigned to the num variable
        // Scanner will read the input
        int num = Integer.valueOf(scanner.nextLine());

        while (true) {
            System.out.println(num);
            if (num >= 11) {
                break;
            }
            num = num + 1;

        }
    }
}
