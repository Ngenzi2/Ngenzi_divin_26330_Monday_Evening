public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        // Simulating ClassNotFoundException by trying to load a non-existent class
        try {
            // Attempting to load a class that does not exist
            Class.forName("com.nonexistent.Class");
        } catch (ClassNotFoundException e) {
            // Handling the ClassNotFoundException
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }
}
/*
This program attempts to load a class named com.nonexistent.Class, which does not exist.
The ClassNotFoundException is caught, and a message is printed to indicate the exception.

 */