public class Division {

    public static double calculate(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return a / b;
    }
}