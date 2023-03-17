import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //a
        System.out.println("Вывод списка продуктов заданного наименования.");
        Products products = new Products();
        System.out.println("Введите название продукта: ");
        Scanner scanner = new Scanner(System.in);
        products.name(scanner.nextLine());
        //b
        System.out.println("Вывод списка продуктов заданного наименования не дороже указанной цены.");
        System.out.println("Введите название продукта: ");
        String label = scanner.nextLine();
        System.out.println("Введите цену: ");
        int n = scanner.nextInt();
        products.price(label, n);
        //c
        System.out.println("Вывод списка продуктов с большим сроком хранения, чем указанный.");
        System.out.println("Введите срок хранения: ");
        int year = scanner.nextInt();
        products.expiration(year);

    }
}