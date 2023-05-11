import java.util.*;
public class SalesPerson {

    private String id;
    private Sales[] salesHistory;
    private int count = 0;

    public SalesPerson(String id) {
        this.id = id;
        salesHistory = new Sales[100];
    }

    public SalesPerson(String id, Sales[] salesHistory, int count) {
        // Initialize the SalesPerson object with the given values
        this.id = id;
        this.salesHistory = salesHistory;
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    public String getId() {
        return id;
    }
    public Sales[] getSalesHistory() {
        return salesHistory;
    }
    public void setSalesHistory(Sales s) {
        salesHistory[count] = s;
        count += 1;
    }
    public double calcTotalSales() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += salesHistory[i].getValue()*salesHistory[i].getQuantity();
        }
        return total;
    }
    public Sales largestSale() {
        double largest = 0;
        Sales largestSale = null;
        for (int i = 0; i < count; i++) {
            double sales = salesHistory[i].getValue()*salesHistory[i].getQuantity();
            if (sales > largest) {
                largest = sales;
                largestSale = salesHistory[i];
            }
        }
        return largestSale;
    }
}
