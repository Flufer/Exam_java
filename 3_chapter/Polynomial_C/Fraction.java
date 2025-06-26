public class Fraction {
    private int m; // Числитель
    private int n; // Знаменатель

    public Fraction(int m, int n) {
        this.m = m;
        this.n = n;
    }

    // Сложение дробей
    public Fraction add(Fraction other) {
        int newM = this.m * other.n + other.m * this.n;
        int newN = this.n * other.n;
        return new Fraction(newM, newN).simplify();
    }

    // Умножение дробей
    public Fraction multiply(Fraction other) {
        return new Fraction(this.m * other.m, this.n * other.n).simplify();
    }

    // Сокращение дроби
    private Fraction simplify() {
        int gcd = gcd(Math.abs(m), Math.abs(n));
        return new Fraction(m / gcd, n / gcd);
    }

    // НОД (алгоритм Евклида)
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    @Override
    public String toString() {
        return m + "/" + n;
    }
}
