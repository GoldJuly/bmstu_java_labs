import java.util.*;
class Order {
    private List<OrderItem> items;
    private Shop shop;

    public Order(Shop shop) {
        items = new ArrayList<>();
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }

    public void addItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (OrderItem item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}