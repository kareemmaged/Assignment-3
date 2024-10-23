public class GroceryItemOrder {
    private String itemName;
    private double pricePerUnit;
    private int quantity;

    public GroceryItemOrder(String name, double pricePerUnit, int quantity) {
        this.itemName = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public double getCost() {
        return pricePerUnit * quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }
}