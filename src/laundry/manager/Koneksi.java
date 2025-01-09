package laundry.manager;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 * This class handles the database connection for the laundry manager application.
 *
 * @author gilar
 */
public class Koneksi {

    private static Connection connection;

    /**
     * Establishes a connection to the MySQL database.
     *
     * @return The established database connection.
     */
    public static Connection getConnection() {
        try {
            // Register the MySQL driver
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); 

            // Establish the connection (using updated driver class)
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry_manager", "root", ""); 
        } catch (SQLException ex) {
            // Handle connection errors with a more informative message
            JOptionPane.showMessageDialog(null, "Database connection error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return connection;
    }
}
