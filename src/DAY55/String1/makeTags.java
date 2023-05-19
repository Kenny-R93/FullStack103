package DAY55.String1;

public class makeTags {
    public String makeTags(String tag, String word) {           //  Method that takes the parameters of String tag and String word
        return "<" + tag + ">" + word + "</" + tag + ">";       // Return the tags around a word using String concatenation
    }

}
