package DAY48.PracticingMethods;

public class AverageMethod {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        int num3 = 8;

        double average = average(num1, num2, num3);
        System.out.println("The average is: " + average);


    }

    // The sum method accepts 3 numbers as parameters and returns the sum of those numbers
    public static Integer sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;

    }

    // The average method accepts 3 numbers as parameters and returns the average of the 3 numbers.
    public static double average(int num1, int num2, int num3) {
        double sumTotal = sum(num1,num2,num3);
        return sumTotal / 3;
    }
}
