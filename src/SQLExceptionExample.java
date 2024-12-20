import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {
    public static void main(String[] args) {
        // Simulating SQLException by trying to connect to a non-existent database
        try {
            // Attempting to connect to an invalid database URL
            Connection conn = DriverManager.getConnection("jdbc:invalid_url", "user", "password");
        } catch (SQLException e) {
            // Handling the SQLException
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }
}
/*
This program tries to connect to a database using an invalid URL.
The SQLException is caught, and a message is printed to indicate the exception
 */