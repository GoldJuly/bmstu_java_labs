import java.util.Random;
import java.util.Scanner;
//Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        Random random = new Random();

        System.out.println("Изначальная матрица: ");
        // заполнение матрицы случайными числами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(2 * n + 1) - n;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        // вычитание среднего арифметического из каждой строки
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }
            int avg = sum / n;
            for (int j = 0; j < n; j++) {
                a[i][j] -= avg;
            }
        }
        // вывод итоговой матрицы
        System.out.println("Итоговая матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}