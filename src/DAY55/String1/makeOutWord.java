package DAY55.String1;

public class makeOutWord {
    public String makeOutWord(String out, String word) {                // Method with the parameters String out and String word
        int midIndex = out.length() / 2;                            // Variable int midIndex that calculates the middle index string divided by two
        String start = out.substring(0, midIndex);          // Variable String start that extracts the substring from the beginning of out up to the midIndex and stores it in the start variable
        String end = out.substring(midIndex);           // Variable that extracts the substring from the middle index to the end of out and stores it in the end variable
        return start + word + end;      // Return that concatenates the variables start, word and end together to create the new string with "word in the middle
    }
}
