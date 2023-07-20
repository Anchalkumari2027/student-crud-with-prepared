package com.jsp.student_crud_with_prepared.controller;

import java.util.Scanner;

import com.jsp.student_crud_with_prepared.dto.Student;
import com.jsp.student_crud_with_prepared.service.StudentService;

public class StudentController {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("main method started!!!!");

		Student student = null;

		StudentService studentService = new StudentService();

		System.out.println("main method ended!!!!");
		System.out.println("1.Insert\n2.Update\n3.Display");
		System.out.println("enter your option");
		int ch = scanner.nextInt();
		switch (ch) {
		/*
		 * case 1 for insertion data
		 */
		case 1: {
			System.out.println("Enter student id");
			int id = scanner.nextInt();
			System.out.println("Enter student name");
			String name = scanner.next();
			System.out.println("Enter student email");
			String email = scanner.next();
			System.out.println("Enter student phone");
			long phone = scanner.nextLong();

			student = new Student(id, name, email, phone);
			studentService.insertStudentService(student);
		}
			break;
		/*
		 * case 2 for update data
		 */
		case 2: {
			System.out.println("1.Name\n2.Email\n3.Phone");
			System.out.println("please choose your option to update your data");
			int ch1 = scanner.nextInt();
			switch (ch1) {
			case 1: {
				System.out.println("Enter student id");
				int id = scanner.nextInt();
				System.out.println("Enter student name");
				String name = scanner.next();

				int id1 = studentService.updateStudentNameService(id, name);
				if (id1 == 1) {
					System.out.println("Data---Updated");
				} else {
					System.out.println("id not found please check once");
				}
			}
				break;
			case 2: {
				System.out.println("first create method");
			}
				break;
			case 3: {
				System.out.println("first create method");
			}
				break;
			}

			
		}
			break;
			
		case 3:{
			studentService.displayStudentDetails();
		}break;
		}

	}
}
