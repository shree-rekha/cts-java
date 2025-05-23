package JAVA;
import java.util.Scanner;

public class DataTypeDemoInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Take integer input
        System.out.print("Enter your age (int): ");
        int age = scanner.nextInt();

        // Take float input
        System.out.print("Enter your height in feet (float): ");
        float height = scanner.nextFloat();

        // Take double input
        System.out.print("Enter your weight in kg (double): ");
        double weight = scanner.nextDouble();

        // Take char input
        System.out.print("Enter your grade (char): ");
        char grade = scanner.next().charAt(0);

        // Take boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Display the values
        System.out.println("\n--- User Input Summary ---");
        System.out.println("Age (int): " + age);
        System.out.println("Height (float): " + height);
        System.out.println("Weight (double): " + weight);
        System.out.println("Grade (char): " + grade);
        System.out.println("Is Student (boolean): " + isStudent);

        scanner.close(); // Close the scanner
    }
}
