public class Car {
    static int last_id = 0;
    private int id, year, price;
    private String brand, label, color, regNumber;
    public Car(int year, int price, String brand, String label, String color, String regNumber){
        last_id++;
        id = last_id;
        this.year = year;
        this.price = price;
        this.brand = brand;
        this.label = label;
        this.color = color;
        this.regNumber = regNumber;
    }

    public void setYear(int year){
        this.year = year;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }

    public int getYear(){
        return year;
    }
    public int getPrice(){
        return price;
    }
    public String getBrand(){
        return brand;
    }
    public String getLabel(){
        return label;
    }
    public String getColor(){
        return color;
    }
    public String getRegNumber(){
        return regNumber;
    }

    @Override
    public String toString(){
        return String.valueOf(year)+" "+String.valueOf(price)+" "+brand+" "+label+" "+color+" "+regNumber;
    }
}
