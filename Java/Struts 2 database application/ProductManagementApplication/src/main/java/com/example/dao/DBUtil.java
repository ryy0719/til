package com.example.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

    // docker run --name database_name -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=database_name -p 3306:3306 -d mysql:8
    public static Connection getConnection()
    {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name", "root", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
