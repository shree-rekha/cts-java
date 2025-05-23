import java.util.*;
import java.util.stream.Collectors;

// Define a record (available from Java 16+)
record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        System.out.print("How many people do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Create Person records from user input
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter age for " + name + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline

            people.add(new Person(name, age));
        }

        // Print all persons
        System.out.println("\nAll people:");
        people.forEach(System.out::println);

        // Filter and print persons aged 18 or older
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("\nAdults (age 18 or older):");
        adults.forEach(System.out::println);

        scanner.close();
    }
}
