import java.util.Scanner;
public class Products {
    final int n = 5;
    private Product[] products = new Product[n];

    public Products(){
        products[0] = new Product(3, 10, "Молоко", "S4", "Простоквашино", 2);
        products[1] = new Product(2, 100000, "Хлеб", "A4", "Селянка", 1);
        products[2] = new Product(4, 10000, "Торт", "D3", "У Палыча", 3);
        products[3] = new Product(7, 99999999, "Сырок", "G2", "Б.Ю. Александров", 4);
        products[4] = new Product(90, 99999999, "Сидр", "E3", "Chester", 5);
    }
    public void name(String name){
        System.out.println("Список продуктов "+name+": ");
        for (int i = 0; i<n; i++){
            if (products[i].getName().equals(name)){
                System.out.println(products[i]);
            }
        }
    }

    public void price(String name, int n){
        System.out.println("Список продуктов "+name+", не дороже "+n+" : ");
        for (int i = 0; i<this.n; i++){
            if((products[i].getName().equals(name))&&((products[i].getPrice())<=n)){
                System.out.println(products[i]);
            }
        }
    }

    public void expiration(int expiration){
        System.out.println("Список продуктов, срок хранения которых больше "+expiration+":");
        for (int i=0;i<n;i++){
            if (products[i].getExpiration()>expiration){
                System.out.println(products[i]);
            }
        }
    }
}
