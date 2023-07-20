package com.jsp.student_crud_with_prepared.dto;

/**
 * 
 * @author ANSARI
 *
 */

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentEmail;
	private long studentPhone;
	
	/*
	 * no argument constructor
	 */
	public Student() {
		super();
	}

	/*
	 * argument constructor
	 */
	public Student(int studentId, String studentName, String studentEmail, long studentPhone) {
		super(); 
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentPhone = studentPhone;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}

	@Override
	public String toString() {
		
		return "";
	}
}
