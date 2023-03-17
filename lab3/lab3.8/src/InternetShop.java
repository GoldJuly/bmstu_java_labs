public class InternetShop {

    public static void main(String[] args) {
        // Создаем объекты интернет-магазина, администратора и клиента
        Shop shop = new Shop();
        Administrator admin = new Administrator();
        Customer customer = new Customer();

        // Администратор добавляет информацию о товаре в магазин
        Product product = new Product("Название товара", "Описание товара", 100.0, 10);
        admin.addProduct(shop, product);

        // Клиент делает и оплачивает заказ на товары
        Order order = customer.makeOrder(shop, product, 2);
        customer.payForOrder(order);

        // Администратор регистрирует продажу и добавляет неплательщика в черный список
        admin.registerSale(shop, order);
        admin.addToBlacklist(shop, customer);
    }
}
