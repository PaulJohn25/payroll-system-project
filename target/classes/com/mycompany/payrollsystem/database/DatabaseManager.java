package com.mycompany.payrollsystem.database;

import com.mycompany.payrollsystem.database.DatabaseConnection;
import com.mycompany.payrollsystem.custom_exceptions.CustomExceptions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManager {

    private final DatabaseConnection databaseConnection;

    public DatabaseManager() {
        this.databaseConnection = new DatabaseConnection();
    }

    public void loginUser(String inputEmail, String inputPassword)
            throws SQLException, CustomExceptions.IncorrectPasswordException, CustomExceptions.UserNotFoundException {

        String selectSql = "SELECT * FROM users WHERE email=?";
        String updateSql = "UPDATE users SET last_login = CURRENT_TIMESTAMP WHERE email = ?";

        try {
            Connection connection = databaseConnection.getConnection();

            try (PreparedStatement selectStatement = connection.prepareStatement(selectSql); PreparedStatement updateStatement = connection.prepareStatement(updateSql);) {

                selectStatement.setString(1, inputEmail);

                try (ResultSet resultSet = selectStatement.executeQuery()) {
                    if (resultSet.next()) {
                        String storedPassword = resultSet.getString("password");

                        if (inputPassword.equals(storedPassword)) {
                            // Update the last_login timestamp
                            updateStatement.setString(1, inputEmail);
                            updateStatement.executeUpdate();
                            connection.close();
                        } else {
                            throw new CustomExceptions.IncorrectPasswordException("Incorrect password.");
                        }
                    } else {
                        throw new CustomExceptions.UserNotFoundException("User not found. Please try again.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }

    }

}
