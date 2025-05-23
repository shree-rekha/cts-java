package JAVA;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for marks
        System.out.print("Enter your marks (0-100): ");
        int marks = scanner.nextInt();

        // Variable to store grade
        char grade;

        // Check marks and assign grade
        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks <= 89) {
            grade = 'B';
        } else if (marks >= 70 && marks <= 79) {
            grade = 'C';
        } else if (marks >= 60 && marks <= 69) {
            grade = 'D';
        } else if (marks >= 0 && marks < 60) {
            grade = 'F';
        } else {
            // Handle invalid marks input
            System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
            scanner.close();
            return; // Exit the program early
        }

        // Display the grade
        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}
