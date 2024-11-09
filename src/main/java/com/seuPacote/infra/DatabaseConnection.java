package com.seuPacote.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String URL = "jdbc:mysql://192.168.1.246:3306/pizzaria";
    private static final String USER = "userpizzaria";
    private static final String PASSWORD = "#USERpizza06";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
