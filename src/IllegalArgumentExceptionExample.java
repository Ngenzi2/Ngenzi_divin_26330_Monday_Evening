public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        // Simulating IllegalArgumentException by passing an invalid argument
        try {
            Thread thread = new Thread();
            // Attempting to set an invalid thread priority
            thread.setPriority(20); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            // Handling the IllegalArgumentException
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }
}
/*
This program attempts to set a thread's priority to an invalid value (greater than the maximum).
The IllegalArgumentException is caught, and a message is printed to indicate the exception.
 */