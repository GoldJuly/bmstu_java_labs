import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class QEquation {
    private int a, b, c;
    private double xExtr, yExtr;
    public QEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public QEquation(int a, int b){
        this.a = a;
        this.b = b;
    }
    public QEquation (int a){
        this.a = a;
    }
    public QEquation (){
        System.out.println("Введите параметры квадратного уравнения.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите а:");
        this.a = scanner.nextInt();
        System.out.print("Введите b:");
        this.b = scanner.nextInt();
        System.out.print("Введите c:");
        this.c = scanner.nextInt();
        System.out.println("Полученное уравнение: "+this.a+"x^2+"+this.b+"x+"+this.c);
    }

    public Set solve(){
        Set<String> xSet = new HashSet<>();
        int disc = b*b - 4*a*c;
        if (disc > 0) {
            double x1 = (-b+Math.sqrt(disc))/(2*a);
            xSet.add(String.valueOf(x1));
            double x2 = (-b-Math.sqrt(disc))/(2*a);
            xSet.add(String.valueOf(x2));
        } else if (disc == 0) {
            double x = (-b/(2*a));
            xSet.add(String.valueOf(x));
        }
        return xSet;
    }
    public void find_extr(){
        //Set<String> extrSet = new HashSet<>();
        this.xExtr = -b/(2*a);
        this.yExtr = a*xExtr*xExtr+b*xExtr+c;
        //extrSet.add(String.valueOf(xExtr));
        //extrSet.add(String.valueOf(yExtr));
        //return extrSet;
    }

    public void inter(){
        this.find_extr();
        System.out.println("Экстремум: ("+xExtr+", "+yExtr+")");
        //double[] extrArray = new double(extr.toArray());

        if (a>0){
            System.out.println("Экстремум является точкой минимума.");
            System.out.println("Интервал убывания (-oo, "+xExtr+")");
            System.out.println("Интервал возрастания ("+xExtr+",+oo)");
        } else {
            System.out.println("Экстремум является точкой максимума.");
            System.out.println("Интервал возрастания (-oo, "+xExtr+")");
            System.out.println("Интервал убывания ("+xExtr+",+oo)");
        }
    }
}
