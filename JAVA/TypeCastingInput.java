package JAVA;
import java.util.Scanner;

public class TypeCastingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take double input from user
        System.out.print("Enter a decimal number (double): ");
        double doubleValue = scanner.nextDouble();

        // Cast double to int (truncates decimals)
        int intFromDouble = (int) doubleValue;

        // Display casting double to int
        System.out.println("You entered double: " + doubleValue);
        System.out.println("After casting double to int: " + intFromDouble);

        // Take int input from user
        System.out.print("Enter an integer number (int): ");
        int intValue = scanner.nextInt();

        // Cast int to double (automatic widening)
        double doubleFromInt = (double) intValue;

        // Display casting int to double
        System.out.println("You entered int: " + intValue);
        System.out.println("After casting int to double: " + doubleFromInt);

        scanner.close();
    }
}
