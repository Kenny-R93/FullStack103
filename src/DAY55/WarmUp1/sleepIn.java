package DAY55.WarmUp1;

public class sleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {         // if/ else statement, if weekday = false or vacation = true return true, else return false
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean isWeekday = false;
        boolean isVacation = true;
        boolean shouldWeSleepIn = sleepIn(isWeekday, isVacation);
        System.out.println("Should I sleep in? " + shouldWeSleepIn);
    }
}
