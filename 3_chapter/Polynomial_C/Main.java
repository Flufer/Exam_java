public class Main {
    public static void main(String[] args) {
        Polynomial[] polynomials = new Polynomial[]{
                new Polynomial(new Fraction[]{new Fraction(1, 2), new Fraction(3, 4)}),
                new Polynomial(new Fraction[]{new Fraction(5, 6), new Fraction(7, 8)})
        };

        Polynomial sum = polynomials[0];
        for (int i = 1; i < polynomials.length; i++) {
            sum = sum.add(polynomials[i]);
        }

        System.out.println("Сумма полиномов: " + sum);
    }
}
