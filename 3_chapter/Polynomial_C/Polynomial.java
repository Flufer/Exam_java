public class Polynomial {
    private Fraction[] coefficients;

    public Polynomial(Fraction[] coefficients) {
        this.coefficients = coefficients;
    }

    // Сложение полиномов
    public Polynomial add(Polynomial other) {
        int maxLength = Math.max(this.coefficients.length, other.coefficients.length);
        Fraction[] result = new Fraction[maxLength];

        for (int i = 0; i < maxLength; i++) {
            Fraction a = (i < this.coefficients.length) ? this.coefficients[i] : new Fraction(0, 1);
            Fraction b = (i < other.coefficients.length) ? other.coefficients[i] : new Fraction(0, 1);
            result[i] = a.add(b);
        }

        return new Polynomial(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < coefficients.length; i++) {
            sb.append(coefficients[i]).append("x^").append(i).append(" + ");
        }
        return sb.substring(0, sb.length() - 3);
    }
}
