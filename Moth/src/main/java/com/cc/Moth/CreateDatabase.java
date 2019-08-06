package com.cc.Moth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class CreateDatabase {
	public void createTable() {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (Exception e) {
			e.printStackTrace();
		}
		SQLiteConfig config = new SQLiteConfig();
		try {
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat\\test2.sqlite", config.toProperties());
			String query = "CREATE TABLE studentList(idx INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, middleTest INTEGER, finalTest INTEGER);";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
