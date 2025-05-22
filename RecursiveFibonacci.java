import java.util.Scanner;

public class RecursiveFibonacci {

    // Recursive method to find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1; // Base cases: first two Fibonacci numbers are 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a positive integer
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int result = fibonacci(n);
            System.out.println("Fibonacci number at position " + n + " is: " + result);
        }

        scanner.close();
    }
}
