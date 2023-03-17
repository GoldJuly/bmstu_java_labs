public class Product {
    static int last_id = 0;
    private int id, expiration, price, amount;
    private String name, upc, producer;
    public Product(int expiration, int price, String name, String upc, String producer, int amount){
        last_id++;
        id = last_id;
        this.expiration = expiration;
        this.price = price;
        this.name = name;
        this.upc = upc;
        this.producer = producer;
        this.amount = amount;
    }

    public void setExpiration(int expiration){
        this.expiration = expiration;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setUpc(String upc){
        this.upc = upc;
    }
    public void setProducer(String producer){
        this.producer = producer;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }

    public int getExpiration(){
        return expiration;
    }
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public String getUpc(){
        return upc;
    }
    public String getProducer(){
        return producer;
    }
    public int getAmount(){
        return amount;
    }

    @Override
    public String toString(){
        return String.valueOf(expiration)+" "+String.valueOf(price)+" "+name+" "+upc+" "+producer+" "+String.valueOf(amount);
    }
}
