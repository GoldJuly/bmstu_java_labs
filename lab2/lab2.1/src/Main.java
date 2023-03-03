import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n слов:");
        List<String> list = new ArrayList<>();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            list.add(scanner.next());
        }
        boolean isPalindrome, isDigit;
        String result = "No palindromes";
        int counter = 0;
        for (String s : list) {
            isPalindrome = true;
            isDigit = true;
            for (int i = 0; i < s.length(); i++){
                if (!Character.isDigit(s.charAt(i))){
                    isDigit=false;
                    break;
                }
            }
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome && isDigit) {
                counter++;
                if (counter <= 2) {
                    result = s;
                }
            }
        }
        System.out.println(result);

        Date date = new Date();
        System.out.println("Фамилия разработчика: Чекир");
        System.out.println("Дата и время выдачи задания: 17.02.2023 17:25");
        System.out.println("Дата и время сдачи задания: " + date);
    }
}