import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LambdaSortWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.print("How many names do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Take input from user
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        // Sort using lambda
        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b)); // Case-insensitive sort

        // Display sorted list
        System.out.println("\nSorted list of names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
