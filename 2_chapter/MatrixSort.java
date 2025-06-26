import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Программа упорядочивает строки матрицы по возрастанию элементов k-го столбца.
 * @author Denis Surovtsev
 */
public class MatrixSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размерность матрицы (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Некорректный ввод!");
            return;
        }

        System.out.print("Введите номер столбца (k) для сортировки (от 0 до " + (n - 1) + "): ");
        int k = scanner.nextInt();

        if (k < 0 || k >= n) {
            System.out.println("Некорректный столбец!");
            return;
        }

        int[][] matrix = new int[n][n];

        // Заполнение матрицы случайными числами от -n до n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2 * n + 1) - n;
            }
        }

        System.out.println("\nИсходная матрица:");
        printMatrix(matrix);

        // Сортировка строк по k-му столбцу
        Arrays.sort(matrix, (a, b) -> Integer.compare(a[k], b[k]));

        System.out.println("\nМатрица после сортировки по " + k + "-му столбцу:");
        printMatrix(matrix);

        scanner.close();

        System.out.println("\nРазработчик: Суровцев Денис");
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}
