import java.util.*;
class Administrator {
    private List<Customer> blacklist;

    public Administrator() {
        blacklist = new ArrayList<>();
    }

    public void addProduct(Shop shop, Product product) {
        shop.addProduct(product);
    }

    public void registerSale(Shop shop, Order order) {
        SalesRecord salesRecord = new SalesRecord(order.getItems(), order.getTotalCost(), order.getShop());
        shop.addSalesRecord(salesRecord);
    }

    public void addToBlacklist(Shop shop, Customer customer) {
        //blacklist.add(customer);
        shop.addBlackList(customer);
    }

    // Другие методы для работы с магазином и черным списком
}
