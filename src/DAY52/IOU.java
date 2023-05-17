package DAY52;

import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> debt;

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5); // object(string, double)
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
        System.out.println(" ");

        // Replace value Arthur owes to 10.5
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 10.5);
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }

    public IOU() {
        debt = new HashMap<>();
    }

    // Saves the amount owed and the person owed to to the IOU.
    public void setSum(String toWhom, double amount) {
        debt.put(toWhom, amount);
    }

    //  Returns the amount owed to the person whose name is given as a parameter. If the person cannot be found, it returns 0.
    public double howMuchDoIOweTo(String toWhom) {
        return debt.getOrDefault(toWhom, 0.0);
    }
}
