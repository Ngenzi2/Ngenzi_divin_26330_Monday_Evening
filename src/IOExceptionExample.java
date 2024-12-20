import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IOExceptionExample {
    public static void main(String[] args) {
        // Simulating IOException by trying to read a non-existent file
        try {
            // Attempting to read a file that does not exist
            Files.readAllLines(Paths.get("non_existent_file.txt"));
        } catch (IOException e) {
            // Handling the IOException
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}
/*
This program attempts to read a file named non_existent_file.txt, which does not exist.
The IOException is caught in the catch block, and a message is printed to indicate that the exception was caught.
 */