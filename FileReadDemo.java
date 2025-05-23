import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    @SuppressWarnings({"CallToPrintStackTrace", "ConvertToTryWithResources"})
    public static void main(String[] args) {
        File file = new File("output.txt");

        try {
            Scanner fileReader = new Scanner(file);
            System.out.println("Contents of output.txt:");

            // Read and print each line
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Make sure output.txt exists.");
            e.printStackTrace();
        }
    }
}
