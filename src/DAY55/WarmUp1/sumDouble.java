package DAY55.WarmUp1;

public class sumDouble {
    public int sumDouble(int a, int b) {            // parameters int a and int b
        int sum = a+ b;                         // shows what we're doing with variables, storing them in a variable where "a + b"

        if ( a == b) {            // if/else statement: if a = b then sum = 2 * sum
            sum = 2 * sum;
        }

        return sum;
    }

}
