public class Log {

    public static double calculate(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Log is only defined for positive numbers.");
        }

        return Math.log10(number);
    }
}
