package com.jsp.student_crud_with_prepared.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentConnection {

	public static Connection getStudentConnection() {
		try {
			//step-1 load/register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 Create Connection
			String url = "jdbc:mysql://localhost:3306/jdbc_preparedstatement";
			String user = "root";
			String pass = "root";
			
			Connection connection=DriverManager.getConnection(url, user, pass);
			
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
