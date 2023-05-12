package DAY48.ArraysListsPracticeProblems;

import java.util.Scanner;

import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Why is it underlined weirdly? Will this cause bugs later on?
        ArrayList<String> listOfStrings = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            listOfStrings.add(input);

        }

        System.out.println("The total amount of items in the list was: " + listOfStrings.size());
    }
}
