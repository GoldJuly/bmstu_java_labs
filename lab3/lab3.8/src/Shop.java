import java.util.*;
class Shop {
    private List<Product> products;
    private List<SalesRecord> sales;
    private List<Customer> blacklist;

    public Shop() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void addSalesRecord(SalesRecord salesRecord){
        sales.add(salesRecord);
    }

    public void addBlackList(Customer customer){
        blacklist.add(customer);
    }

    // Другие методы для работы с товарами в магазине
}
