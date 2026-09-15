import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Calculator =====");

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choose an operation: ");
        int choice = scanner.nextInt();

        double result;

        switch (choice) {

            case 1:
                result = Add.calculate(num1, num2);
                break;

            case 2:
                result = Subtract.calculate(num1, num2);
                break;

            case 3:
                result = Multiplication.calculate(num1, num2);
                break;

            case 4:
                result = Division.calculate(num1, num2);
                break;

            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}