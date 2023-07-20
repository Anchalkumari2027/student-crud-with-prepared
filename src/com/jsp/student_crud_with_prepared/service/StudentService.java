package com.jsp.student_crud_with_prepared.service;

import com.jsp.student_crud_with_prepared.dao.StudentDao;
import com.jsp.student_crud_with_prepared.dto.Student;

public class StudentService {
	
	StudentDao studentDao = new StudentDao();
	/*
	 * insertMethod for student
	 */
	public Student insertStudentService(Student student) {
		System.out.println("insertService method started!!!!");
		
		if(student.getStudentId()<=9999) {
			Student student2=studentDao.insertStudent(student);
			System.out.println("insertService method ended!!!!");
			return student2;
		}else {
			System.err.println("please pass your id with 4 digits or less than it");
		}
		return null;
	}
	
	/*
	 * update student data methods which update stduentName by his/her id
	 */
	public int updateStudentNameService(int studentId, String studentName) {
		
		return studentDao.updateStudentName(studentId, studentName);
		
	}
	
	/*
	 * this is display method which will display all data of students
	 */
	public void displayStudentDetails() {
		studentDao.displayStudentDetails();
	}
}
