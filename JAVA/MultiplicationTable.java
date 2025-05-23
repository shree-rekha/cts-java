package JAVA;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object to read input

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  // Read the number from user

        System.out.println("Multiplication Table for " + number + " up to 10:");

        // Loop from 1 to 10 and print the table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();  // Close the Scanner
    }
}
