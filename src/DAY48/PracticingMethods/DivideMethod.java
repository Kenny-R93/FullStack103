package DAY48.PracticingMethods;

//import java.util.Scanner;

// Divide method w. main method
public class DivideMethod {
    public static void main (String[] args) {

        // Declare two integers
        double num1 = 1;
        double num2 = 3;

        // Divide the two numbers inside of the method body
        divide(num1, num2);

    }

    // Call in main method
    // Accept two numbers as the divide() method parameters
    public static void divide(double num1, double num2) {

        // Store the result as a double variable
        double result = num1 / num2;

        // Print Result
        System.out.println(num1 + " / " + num2 + " = " + result);

    }
}



// Does not work b/c didn't create instance of class
//public static void main (String[] args) {
//    division(5,10);
//
//        int num1 = 5;
//   int num2 = 10;
//
//     division(num1, num2);
//}
//
//    public static void divide(int num1, int num2) {
//        System.out.println("" + num1 + " + " + num2 + " = " + (num1 + num2));













// Like Previous Examples
//    public static void main(String[] args) {
//        // Create the scanner for the reading user input
//        Scanner scanner = new Scanner(System.in);
//
//        // Ask user for first number input
//        System.out.println("Please enter a number?");
//
//        // The string provided by the user will be assigned to the num1 variable
//        // Scanner will read the input entered by the user
//        int num1 = Integer.valueOf(scanner.nextLine());
//
//        // Ask user for a second number input
//        System.out.println("Please enter another number?");
//
//        // The string provided by the user will be assigned to the num2 variable
//        // Scanner will read the input entered by the user
//        int num2 = Integer.valueOf(scanner.nextLine());
//
//        divide(num1,num2);
//
//    }
//
//    public static void divide(int num1, int num2) {
//        System.out.println(num1 + " / " + num2 + " = " + (Double.valueOf(num1)/Double.valueOf(num2)));
//    }
//}
