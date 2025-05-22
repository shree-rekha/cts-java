import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two integers
        System.out.print("Enter the first number (numerator): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (denominator): ");
        int num2 = scanner.nextInt();

        try {
            // Try dividing the first number by the second
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch division by zero and display an error message
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }
}
