/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Paul
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/payroll_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private Connection connection;
 
    public DatabaseConnection() {
//        Connection tempConnection = null;
        
        try {
           this.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); 
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to establish database connection");
        }
        
    }

    public Connection getConnection() {
        return connection;
    }
    
}
