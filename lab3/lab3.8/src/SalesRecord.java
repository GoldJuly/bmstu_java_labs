import java.util.*;
class SalesRecord {
    private List<OrderItem> items;
    private double totalCost;
    private Date saleDate;

    private Shop shop;

    public SalesRecord(List<OrderItem> items, double totalCost, Shop shop) {
        this.items = items;
        this.totalCost = totalCost;
        this.saleDate = new Date();
        this.shop = shop;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Date getSaleDate() {
        return saleDate;
    }
}