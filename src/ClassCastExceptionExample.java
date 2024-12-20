public class ClassCastExceptionExample {
    public static void main(String[] args) {
        // Simulating ClassCastException by performing an invalid type cast
        try {
            Object x = new Integer(0);
            // Attempting to cast an Integer to a String
            System.out.println((String) x); // This will throw ClassCastException
        } catch (ClassCastException e) {
            // Handling the ClassCastException
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }
}

/*
This program attempts to cast an Integer object to a String, which is not valid.
The ClassCastException is caught, and a message is printed to indicate the exception.
 */