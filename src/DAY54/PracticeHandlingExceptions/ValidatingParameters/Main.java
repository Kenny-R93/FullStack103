package DAY54.PracticeHandlingExceptions.ValidatingParameters;

public class Main {
    public static void main(String[] args) {

        // Test Person class

//        Person Yoda = new Person("Yoda", 800);
//        System.out.println(Yoda);

        Person Grogu = new Person("Grogu", 54);
        System.out.println(Grogu);


        // Test Calculator class

        // Factorial
        try {
            int factorialResult = Calculator.factorial(-1);
            System.out.println("Factorial calculation: " + factorialResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Factorial calculation error: " + e.getMessage());
        }


//            int binomialResult = Calculator.binomialCoefficient(2, 4);
//            System.out.println(binomialResult);

        // Binomial
        try {
            int binomialResult = Calculator.binomialCoefficient(2, 4);
            System.out.println(binomialResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Binomial coefficient calculation error: " + e.getMessage());
        }
    }



    }



