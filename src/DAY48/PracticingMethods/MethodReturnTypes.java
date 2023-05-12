package DAY48.PracticingMethods;

public class MethodReturnTypes {
    public static void main(String[] args) {
        // Prints functions
        System.out.println(stringMethod());
        System.out.println(integerMethod());
        System.out.println(booleanMethod());


    }

    // Creates a String method that returns a string.
    public static String stringMethod() {
        return "String of text";
    }

    // Creates an integer method that returns an integer.
    public static int integerMethod() {
        return 5;
    }

    // Creates a boolean method that returns a boolean.
    public static Boolean booleanMethod() {
        return false;
    }

}
