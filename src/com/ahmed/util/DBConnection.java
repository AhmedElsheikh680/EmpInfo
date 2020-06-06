package com.ahmed.util;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBConnection {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn =  DriverManager.getConnection("jdbc:mysql://localhost/studentinfojsp","root","root");
		}catch(Exception ee){
			ee.printStackTrace();
		}
		return conn;
	}
}
