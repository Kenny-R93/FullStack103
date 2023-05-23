package DAY57;


import java.sql.SQLOutput;

public class Debugger {

    public static double calculateAverage(int[] numbers) {           // Non-Static method error; Forgot to make it "static"
        int sum = 0;
        for (int i=0; i < 5; i++) {
            sum += numbers[i];  // + 2; // Incorrectly introducing "+ 2" to the end of line 11 will change the average result to "5.0" and hence not the desired 3.0 average result. Can fix this issue by removing the +2.
        }           // Used Debugger to find the ArrayIndexOutOfBoundsException error.  Out of bounds because i is suppose to be "less than 5" rather than "less than 10" on line 10.
        return (double) sum / numbers.length;
    }


    public static void main(String[] args) {
        String avg = "Average";              // Num is null which will give an error when calling this method. Fixed by making not equal to null
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers); // Ran debugger and it gave a non-static method on line 19. Hovering mouse over error recommended making the method above static.
        System.out.println("Average: " + average);
        System.out.println("Letters in 'Average': " + avg.length()); // Calling num will give a NullPointerException error. Used debugger to find line that was causing the error



    }

}
