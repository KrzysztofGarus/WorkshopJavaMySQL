package pl.coderslab;

import java.sql.*;

public class DbUtil {
    private static final String DB_URL_WORKSHOP = "jdbc:mysql://localhost:3306/workshop2";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "coderslab";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL_WORKSHOP, DB_USER, DB_PASS);
    }
}
