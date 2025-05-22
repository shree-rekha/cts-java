import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner to read input

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();  // Read an integer from the user

        // Check if it's a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();  // Close the scanner
    }
}
