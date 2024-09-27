package com.example.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	// docker run --name struts2DB  -e MYSQL_ROOT_PASSWORD=system -e MYSQL_DATABASE=struts2DB -p 3306:3306 -d mysql:8 
	public static Connection getConnection()
	{
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/struts2DB", "root", "system");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
