package com.cc.Moth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


import org.sqlite.SQLiteConfig;

public class InsertData {
	public void method2(int idx) {
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat\\test2.sqlite", config.toProperties());

			int middleTest = 0;
			int finalTest = 0;
			
			String query = "UPDATE studentList SET middleTest=" + middleTest + ", finalTest=" + finalTest 
					+ " WHERE idx=" + idx;
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}	
