public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        // Simulating ArithmeticException by performing a division by zero
        try {
            // Attempting to divide by zero
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            // Handling the ArithmeticException
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
/*
This program attempts to divide 10 by 0, which is not allowed in arithmetic.
The ArithmeticException is caught, and a message is printed to indicate the exception.
 */