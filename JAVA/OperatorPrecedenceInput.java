package JAVA;
import java.util.Scanner;

public class OperatorPrecedenceInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's evaluate: 10 + 5 * 2");
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();  // 10

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();  // 5

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();  // 2

        // Evaluate 10 + 5 * 2 with operator precedence
        int mult = num2 * num3;          // 5 * 2 = 10
        int result = num1 + mult;        // 10 + 10 = 20

        System.out.println("Step 1: Multiply " + num2 + " * " + num3 + " = " + mult);
        System.out.println("Step 2: Add " + num1 + " + " + mult + " = " + result);

        // Now try with parentheses ( (10 + 5) * 2 )
        int sum = num1 + num2;           // 10 + 5 = 15
        int result2 = sum * num3;        // 15 * 2 = 30

        System.out.println("\nNow with parentheses: (10 + 5) * 2");
        System.out.println("Step 1: Add " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Step 2: Multiply " + sum + " * " + num3 + " = " + result2);

        scanner.close();
    }
}
