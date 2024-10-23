public class Main {
    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList();

        groceryList.add(new GroceryItemOrder("Cookies", 2.30, 4));
        groceryList.add(new GroceryItemOrder("Milk", 1.50, 2));
        groceryList.add(new GroceryItemOrder("Eggs", 0.20, 12));

        groceryList.displayItems();

        double totalCost = groceryList.getTotalCost();
        System.out.printf("Total cost of grocery list: $%.2f%n", totalCost);

    }
}