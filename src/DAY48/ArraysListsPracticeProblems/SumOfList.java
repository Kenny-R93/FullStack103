package DAY48.ArraysListsPracticeProblems;

import java.util.Scanner;

import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> inputs = new ArrayList<>();

        System.out.println("Enter integers. When ready enter 0 to get the sum: ");
        int input = scanner.nextInt();

        while (input != 0) {
            inputs.add(input);
            input = scanner.nextInt();
        }
        int sum = sum(inputs);
        System.out.println(inputs + " were the items in the list. The sum of that list is: " + sum);
    }

    public static int sum(ArrayList<Integer> inputs) {
        int sum = 0;
        for (Integer input : inputs) {
            sum += input;
        }
        return sum;
    }
}
