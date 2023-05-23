package DAY57;



public class Debugger {

    public double calculateAverage (int[] numbers ) {
        int sum = 0;
        for (int i=0; i<10; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);
    }

}
