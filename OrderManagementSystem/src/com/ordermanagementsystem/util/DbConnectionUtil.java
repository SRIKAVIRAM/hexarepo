package com.ordermanagementsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/ordermanagement";
    private static final String USER = "root";
    private static final String PASSWORD = "srikavi07..";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
