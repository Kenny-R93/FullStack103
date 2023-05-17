package DAY52;

import java.util.HashMap;


public class Nicknames {
    public static void main(String[] args) {
        // Create a new HashMap object
        HashMap<String, String> names = new HashMap<> ();
    // Store the names and nicknames
    names.put("Matthew", "Matt");
    names.put("Michael","Mix");
    names.put("Arthur", "Artie");

    // Possible method 1 to retrieve
//    String matthewName = names.get("Matthew");
//    System.out.println(matthewName);

    // Possible method 2 to retrieve
//    System.out.println(names.get("Matthew"));

    // Possible method 3 to retrieve: Module Method
    String MatthewsNickname = names.get("Matthew");
    System.out.println(MatthewsNickname);

    }
}
