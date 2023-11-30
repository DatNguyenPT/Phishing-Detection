package com.datnguyen.PhishingDetection.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/urldataset";
        String username = "root";
        String password = "28102004";

        try {
            System.out.println("Connecting to database...");
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection successful!");
            connection.close();
        } catch (Exception e) {
            System.err.println("Connection failed. Error: " + e.getMessage());
        }
    }
}
