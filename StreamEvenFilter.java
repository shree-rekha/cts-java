import java.util.*;
import java.util.stream.Collectors;

public class StreamEvenFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Input: number of elements
        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        // Input: list of integers
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Stream API: filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        // Output
        System.out.println("\nEven numbers:");
        evenNumbers.forEach(System.out::println);

        scanner.close();
    }
}
