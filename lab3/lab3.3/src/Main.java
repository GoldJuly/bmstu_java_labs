import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //a
        Cars cars = new Cars();
        System.out.println("Введите марку машины: ");
        Scanner scanner = new Scanner(System.in);
        cars.brand(scanner.nextLine());
        //b
        System.out.println("Введите модель машины: ");
        String label = scanner.nextLine();
        System.out.println("Введите срок эксплуатации: ");
        int n = scanner.nextInt();
        cars.label(label, n);
        //c
        System.out.println("Введите год выпуска машины: ");
        int year = scanner.nextInt();
        System.out.println("Введите цену машины: ");
        int price = scanner.nextInt();
        cars.year(year, price);
    }
}