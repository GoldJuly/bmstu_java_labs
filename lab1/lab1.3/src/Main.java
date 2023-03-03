import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Заполните массив целыми числами");
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Числа, которые делятся на 3 или на 9:");
        for (int i = 0; i < size; i++){
            if (array[i] % 3 == 0 || array[i] % 9 == 0){
                System.out.println(array[i]);
            }
        }
    }
}