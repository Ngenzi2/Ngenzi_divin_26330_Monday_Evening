public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        // Simulating ArrayIndexOutOfBoundsException by accessing an invalid array index
        try {
            int[] arr = new int[5];
            // Attempting to access an index that is out of bounds
            System.out.println(arr[10]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
/*
This program attempts to access the 10th index of an array that only has 5 elements.
The ArrayIndexOutOfBoundsException is caught, and a message is printed to indicate the exception
 */