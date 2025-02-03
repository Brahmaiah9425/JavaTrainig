package org.example.EmployeeDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private static Connection conn;

   
    public static Connection getConnection() {
        if (conn == null) {
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/exampledatabase", 
                    "root", 
                    "root"  
                );
                System.out.println("Database connected successfully.");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    
    public static void createEmployeeTable() {
        try (Connection conn = getConnection()) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Employee ("
                    + "eid INT AUTO_INCREMENT PRIMARY KEY, "
                    + "ename VARCHAR(100), "
                    + "esalary DECIMAL(10, 2), "
                    + "epost VARCHAR(100));";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(createTableSQL);
            System.out.println("Employee table created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
