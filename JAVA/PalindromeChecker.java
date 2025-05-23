package JAVA;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 1: Clean the string (remove non-alphanumeric characters, convert to lowercase)
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Step 3: Compare and display result
        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
