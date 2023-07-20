package com.jsp.student_crud_with_prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.student_crud_with_prepared.connection.StudentConnection;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentDao {

	Connection connection = StudentConnection.getStudentConnection();

	/*
	 * insertMethod for student
	 */
	public Student insertStudent(Student student) {
		System.out.println("insertDao method started!!!!");
		String insertQuery = "insert into student values(?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

			preparedStatement.setInt(1, student.getStudentId());
			preparedStatement.setString(2, student.getStudentName());
			preparedStatement.setString(3, student.getStudentEmail());
			preparedStatement.setLong(4, student.getStudentPhone());

			preparedStatement.execute();
			System.out.println("insertDao method ended!!!!");
			System.out.println("Data....Stored....");
			return student;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}/* method insert ended */

	/*
	 * update student data methods
	 */
	public int updateStudentName(int studentId, String studentName) {

		String updateStudentNameQuery = "update student set name=? where id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateStudentNameQuery);

			preparedStatement.setInt(2, studentId);
			preparedStatement.setString(1, studentName);

			return preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	public void displayStudentDetails() {
		
		String displayStudentQuery = "SELECT * FROM student";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(displayStudentQuery);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				
				
				int id=resultSet.getInt("id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				long phone = resultSet.getLong("phone");
				
				System.out.println("id = "+id);
				System.out.println("name = "+name);
				System.out.println("email = "+email);
				System.out.println("phone = "+phone);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * delete method
	 */
	public int deleteStduentById(int studentId) {
		
		return 0;
	}
}
