package DAY49;
// Product Assignment
public class Product {
    private double productCost;

    private double productQty;

    private String productName;

    public Product(double productCost, double productQty, String productName) {
        this.productCost = productCost;
        this.productQty = productQty;
        this.productName = productName;
    }

    public void totalCost() {
        double total = productCost * productQty;
        System.out.println("The total cost of products: " + total);
    }

    public void printProduct() {
        System.out.println("The cost of one unit of " + productName + " is " + productCost);
        System.out.println(productQty + " were purchased");
    }

    public void method () {

    }

}
