import java.util.Date;
import java.util.Scanner;
// Используя оператор switch, написать программу, которая выводит на экран сообщения о принадлежности некоторого значения k интервалам (-10k, 0], (0, 5], (5, 10], (10, 10k].
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите k: ");
        int k = scanner.nextInt();
        int maxValue = 10 * k;
        int minValue = -10 * k;

        int switchVariable = 0;
        if (k > minValue && k <= 0) {
            switchVariable = 1;
        }
        if (k > 0 && k <= 5) {
            switchVariable = 2;
        }
        if (k > 5 && k <= 10) {
            switchVariable = 3;
        }
        if (k > 10 && k <= maxValue) {
            switchVariable = 4;
        }

        switch (switchVariable) {
            case 0:
                System.out.println("Некорректное значение k.");
                break;
            case 1:
                System.out.println(k + " принадлежит интервалу (-10k, 0]");
                break;
            case 2:
                System.out.println(k + " принадлежит интервалу (0, 5]");
                break;
            case 3:
                System.out.println(k + " принадлежит интервалу (5, 10]");
                break;
            case 4:
                System.out.println(k + " принадлежит интервалу (10, 10k]");
                break;
        }

        Date date = new Date();
        System.out.println("Фамилия разработчика: Чекир");
        System.out.println("Дата и время выдачи задания: 17.02.2023 17:25");
        System.out.println("Дата и время сдачи задания: " + date);
    }
}