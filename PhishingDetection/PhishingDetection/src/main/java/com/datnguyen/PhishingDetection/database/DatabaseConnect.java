package com.datnguyen.PhishingDetection.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {
    public static Connection connect()throws SQLException{
        String jdbcUrl = "jdbc:mysql://localhost:3306/urldataset";
        String username = "root";
        String password = "28102004";
        return DriverManager.getConnection(jdbcUrl, username, password);
    }
}
