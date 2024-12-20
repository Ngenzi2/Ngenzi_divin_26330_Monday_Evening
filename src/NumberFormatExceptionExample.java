public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        // Simulating NumberFormatException by attempting to convert an invalid string to a number
        try {
            // Attempting to parse a string that is not a valid number
            int num = Integer.parseInt("NotANumber"); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            // Handling the NumberFormatException
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}

/*
This program attempts to parse a string that does not represent a valid integer.
The NumberFormatException is caught, and a message is printed to indicate the exception.

*/