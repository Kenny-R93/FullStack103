package DAY46;

public class CastingAssignment {
    public static void main(String[] args){
        // Create a double type variable
        double decimalNum = 112.35;
        System.out.println("Double: " + decimalNum);

        // Convert into int type variable using explicit casting
        int rsNum = (int)decimalNum;
        System.out.println("int: " + rsNum);

        // String variable
        String String = "49";
        System.out.println("The string value is: " + String );

        // Convert to int variable using the parseInt() method
        int intNum = Integer.parseInt(String);
        System.out.println("The integer value is: " + intNum);
    }
}

