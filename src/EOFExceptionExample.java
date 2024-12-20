import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.IOException;

public class EOFExceptionExample {
    public static void main(String[] args) {
        // Simulating EOFException by trying to read from an empty file
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("empty_file.txt"));
            // Attempting to read beyond the end of the file
            in.readUTF(); // This will throw EOFException if the file is empty
        } catch (EOFException e) {
            // Handling the EOFException
            System.out.println("EOFException caught: " + e.getMessage());
        } catch (IOException e) {
            // Handling other IOExceptions
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}
/*
This program attempts to read from a file named empty_file.txt, which is assumed to be empty.
The EOFException is caught when trying to read beyond the end of the file.

 */