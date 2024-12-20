public class NullPointerExceptionExample {
    public static void main(String[] args) {
        // Simulating NullPointerException by accessing a null reference
        try {
            String str = null;
            // Attempting to access the length of a null string
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            // Handling the NullPointerException
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}
/*
This program tries to access the length of a string that is null.
The NullPointerException is caught, and a message is printed to indicate the exception.
 */