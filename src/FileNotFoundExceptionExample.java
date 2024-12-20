import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        // Simulating FileNotFoundException by trying to open a missing file
        try {
            // Attempting to open a file that does not exist
            FileReader file = new FileReader("missing_file.txt");
        } catch (FileNotFoundException e) {
            // Handling the FileNotFoundException
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }
}
/*
This program tries to open a file named missing_file.txt, which does not exist.
The FileNotFoundException is caught, and a message is printed to indicate the exception.
 */