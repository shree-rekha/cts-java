package JAVA;
import java.util.Scanner;

// Step 1: Define the interface
interface Playable {
    void play();
}

// Step 2: Implement the interface in the Guitar class
class Guitar implements Playable {
    public void play() {
        System.out.println("Strumming the guitar...");
    }
}

// Step 3: Implement the interface in the Piano class
class Piano implements Playable {
    public void play() {
        System.out.println("Playing the piano...");
    }
}

// Step 4: Main class to use the interface
public class InstrumentPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which instrument would you like to play? (guitar/piano): ");
        String choice = scanner.nextLine().toLowerCase();

        Playable instrument;

        if (choice.equals("guitar")) {
            instrument = new Guitar();
        } else if (choice.equals("piano")) {
            instrument = new Piano();
        } else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        // Call the play method
        instrument.play();

        scanner.close();
    }
}
