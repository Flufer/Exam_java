public class Main {
    public static void main(String[] args) {
        Fraction[] fractions = new Fraction[]{
                new Fraction(1, 2),
                new Fraction(3, 4),
                new Fraction(5, 6)
        };

        // Изменение элементов с четным индексом
        for (int i = 0; i < fractions.length; i += 2) {
            if (i + 1 < fractions.length) {
                fractions[i] = fractions[i].add(fractions[i + 1]);
            }
        }

        // Вывод результата
        for (Fraction f : fractions) {
            System.out.println(f);
        }
    }
}
