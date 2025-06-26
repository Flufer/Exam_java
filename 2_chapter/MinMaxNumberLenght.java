import java.util.Scanner;
/**
 * Программа находит самое короткое и самое длинное число из введенных.
 * @author Denis Surovtsev
 */
public class MinMaxNumbersLenght {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Некорректный ввод!");
            return;
        }

        System.out.println("Введите " + n + " чисел:");
        String[] numbers = new String[n];
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLine();
        }

        String shortest = numbers[0];
        String longest = numbers[0];

        for (String num : numbers) {
            if (num.length() < shortest.length()) {
                shortest = num;
            }
            if (num.length() > longest.length()) {
                longest = num;
            }
        }

        System.out.println("Самое короткое число: " + shortest + " (длина: " + shortest.length() + ")");
        System.out.println("Самое длинное число: " + longest + " (длина: " + longest.length() + ")");

        scanner.close();

        System.out.println("\nРазработчик: Суровцев Денис");
    }
}
