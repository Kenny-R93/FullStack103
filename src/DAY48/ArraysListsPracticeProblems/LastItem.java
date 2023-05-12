package DAY48.ArraysListsPracticeProblems;

import java.util.Scanner;

import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            listOfStrings.add(input);

        }

        String theLastItem = listOfStrings.get(listOfStrings.size() - 1);
        System.out.println("The last item in the list is: " + theLastItem);
    }
}
