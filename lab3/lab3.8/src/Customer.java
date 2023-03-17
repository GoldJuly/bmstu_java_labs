class Customer {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Order makeOrder(Shop shop, Product product, int quantity) {
        Order order = new Order(shop);
        order.addItem(product, quantity);
        return order;
    }

    public void payForOrder(Order order) {
        // Реализация оплаты заказа
        this.setBalance(this.getBalance() - order.getTotalCost());
    }
}