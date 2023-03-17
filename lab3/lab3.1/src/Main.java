import java.util.ArrayList;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Complex complex1 = new Complex();
        complex1.complex_out();
        Complex complex2 = new Complex();
        complex2.complex_out();
        System.out.println("Сложение:");
        Complex add = complex1.add(complex2);
        add.complex_out();
        System.out.println("Вычитание:");
        Complex sub = complex1.sub(complex2);
        sub.complex_out();
        System.out.println("Умножение:");
        Complex mul = complex1.mul(complex2);
        mul.complex_out();
        System.out.println("Деление:");
        Complex div = complex1.div(complex2);
        div.complex_out();
        System.out.println("Присваивание:");
        complex1.copy(complex2);
        complex1.complex_out();
        //System.out.println("Результат: ", complex.i, "+", complex.j, "j");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность векторов комплексных координат n:");
        int n = scanner.nextInt();
        Complex[] vector1 = new Complex[n];
        Complex[] vector2 = new Complex[n];
        System.out.println("Введите первый вектор координат размерности "+n+": ");
        for (int i=0; i<n;i++){vector1[i] = new Complex();}
        System.out.println("Введите второй вектор координат размерности "+n+": ");
        for (int i=0; i<n;i++){vector2[i] = new Complex();}

        System.out.println("Сложение двух векторов: ");
        for (int i=0; i<n; i++){
            vector1[i].add(vector2[i]).complex_out();
        }
    }
}