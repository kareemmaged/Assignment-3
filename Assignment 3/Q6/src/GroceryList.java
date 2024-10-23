import java.util.ArrayList;

public class GroceryList {
    private ArrayList<GroceryItemOrder> items;
    private static final int MAX_ITEMS = 10;

    public GroceryList() {
        items = new ArrayList<>();
    }

    public void add(GroceryItemOrder item) {
        if (items.size() < MAX_ITEMS) {
            items.add(item);
        } else {
            System.out.println("Grocery list is full. Cannot add more items.");
        }
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (GroceryItemOrder item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    public void displayItems() {
        System.out.println("Grocery List Items:");
        for (GroceryItemOrder item : items) {
            System.out.println(item.getQuantity() + " x " + item.getItemName() + " at " + item.getCost());
        }
    }
}
