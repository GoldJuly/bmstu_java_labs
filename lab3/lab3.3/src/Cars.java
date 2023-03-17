import java.util.Scanner;
public class Cars {
    final int n = 5;
    private Car[] cars = new Car[n];
    //int n;

    public Cars(){
        //System.out.println("Введите количество машин: ");
        //Scanner scanner = new Scanner (System.in);
        //int n = scanner.nextInt();
        //cars = new Car[n];
        cars[0] = new Car(2000, 10, "Suzuki", "S4", "красный", "к183ек");
        cars[1] = new Car(2023, 100000, "Audi", "A4", "голубой", "й777ег");
        cars[2] = new Car(2007, 10000, "Hyundai", "Creta", "оранжевый", "э228мо");
        cars[3] = new Car(1952, 99999999, "Lada", "Kalina", "красный", "c917cp");
        cars[4] = new Car(1952, 99999999, "Moskvich", "3e", "белый", "р111ус");
    }
    public void brand(String brand){
        System.out.println("Список автомобилей марки "+brand+": ");
        for (int i = 0; i<n; i++){
            if (cars[i].getBrand().equals(brand)){
                System.out.println(cars[i]);
            }
        }
    }

    public void label(String label, int n){
        System.out.println("Список автомобилей модели "+label+", эксплуатируемых более "+n+" лет: ");
        for (int i = 0; i<this.n; i++){
            if((cars[i].getLabel().equals(label))&&((2023-cars[i].getYear())>n)){
                System.out.println(cars[i]);
            }
        }
    }

    public void year(int year, int price){
        System.out.println("Список автомобилей "+year+" года выпуска, дороже "+price+" y.e.:");
        for (int i=0;i<n;i++){
            if (cars[i].getYear()==year && cars[i].getPrice()>price){
                System.out.println(cars[i]);
            }
        }
    }
}
