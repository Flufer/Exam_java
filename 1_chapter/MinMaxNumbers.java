import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите количество чисел (n): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Некорректное количество чисел.");
            return;
        }

        System.out.println("Введите " + n + " целых чисел:");
        int firstNum = scanner.nextInt();
        int min = firstNum;
        int max = firstNum;

        for (int i = 1; i < n; i++) {
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Наименьшее число: " + min);
        System.out.println("Наибольшее число: " + max);
        
        scanner.close();
    }
}
