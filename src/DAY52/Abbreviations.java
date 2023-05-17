package DAY52;

import java.util.HashMap;

public class Abbreviations {
    private static HashMap<String, String> abbrvHash = new HashMap<>();
    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
    // Constructor
    public Abbreviations() {
    }

    // Adds a new abbreviation and its explanation.
    public void addAbbreviation(String abbreviation, String explanation) {
        abbrvHash.put(abbreviation, explanation);


    }

    //  Checks if an abbreviation has already been added; returns true if it has and false if it has not.
    public boolean hasAbbreviation(String abbreviation) {
        return abbrvHash.containsKey(abbreviation);  // return b/c don't have void From Module:boolean exists = abbrvHash.containsKey("")

    }

    // Finds the explanation for an abbreviation; returns null if the abbreviation has not been added yet.
    public String findExplanationFor(String abbreviation) {
        return abbrvHash.get(abbreviation);
    }

}
