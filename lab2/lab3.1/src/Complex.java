import java.util.Scanner;
public class Complex {
    private int i, j;
    public Complex (int i, int j){
        this.i = i;
        this.j = j;
    }
    public Complex () {
        //this.i = 0;
        //this.j = 0;
        Scanner scanner = new.Scanner(System.in);
        System.out.println("Введите вещественную часть комплексного числа: ");
        this.i = scanner.nextInt();
        System.out.println("Введите мнимую часть комплексного числа: ");
        this.j = scanner.nextInt();
    }
    public Complex (int i) {
        this.i = i;
        this.j = 0;
    }

    public Complex add(Complex x){
        return Complex result(x.i+this.i, x.j+this.j);
    }
}
