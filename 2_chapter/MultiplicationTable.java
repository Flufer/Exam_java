/**
 * Программа упорядочивает строки матрицы по возрастанию элементов k-го столбца.
 * @author Denis Surovtsev
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Таблица умножения:");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        System.out.println("\nРазработчик: Суровцев Денис");
    }
}
