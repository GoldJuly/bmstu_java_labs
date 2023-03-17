import java.util.Random;
import java.util.Scanner;

// Ввести с консоли n – размерность матрицы a[n][n].
// Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.
// Вычислить определитель матрицы.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        Random random = new Random();
        System.out.println("Матрица: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(2 * n + 1) - n;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int det = calculateDeterminant(a);
        System.out.println("Определитель матрицы: " + det);
    }
    public static int calculateDeterminant(int[][] a) {
        int n = a.length;
        if (n == 1) {
            return a[0][0];
        }
        if (n == 2) {
            return a[0][0] * a[1][1] - a[0][1] * a[1][0];
        }
        int det = 0;
        for (int j = 0; j < n; j++) {
            int[][] submatrix = new int[n - 1][n - 1];
            for (int i = 1; i < n; i++) {
                int k = 0;
                for (int l = 0; l < n; l++) {
                    if (l != j) {
                        submatrix[i - 1][k] = a[i][l];
                        k++;
                    }
                }
            }
            det += Math.pow(-1, j) * a[0][j] * calculateDeterminant(submatrix);
        }
        return det;
    }
}