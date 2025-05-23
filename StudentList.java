import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        // Create an ArrayList to store student names
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many student names do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Add names to the list
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            studentNames.add(name);
        }

        // Display all names
        System.out.println("\nList of student names:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}
