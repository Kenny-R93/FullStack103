package DAY55.WarmUp1;

public class diff21 {
    public int diff21(int n) {
        if ( n <= 21) {             // if/else statement: if integer n is less than or equal to 21 then return absolute difference
            return 21 - n;
        }else{              // else ( anything higher than 21) return the absolute difference * 2
            return (n -21) * 2;
        }
    }
}
