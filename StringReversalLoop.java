import java.util.Scanner;

public class StringReversalLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a string
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String reversed = "";
        // Loop through the string backwards
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Display the reversed string
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
