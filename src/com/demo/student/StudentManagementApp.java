package com.demo.student;

import java.util.List;
import java.util.Scanner;

import com.demo.models.Student;
import com.demo.service.StudentService;
import com.demo.sevice.impl.StudentServiceImpl;

public class StudentManagementApp {
	
	public static void main(String[] args) {
		int cases;
		boolean status = true;
		StudentService studentService = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to insert student");
		System.out.println("Enter 2 to show student list");
		
		do {
			cases = sc.nextInt();
		switch(cases) {
		
		case 1:
			Student student = new Student();
			student.setStudentId(1234);
			student.setStudentClass("12th");
			student.setStudentName("Vaishnavi");
			student.setStudentRollNo("101");
			String insertStudent = studentService.insertStudent(student);
			System.out.println(insertStudent);
			break;
			
		case 2:
			List<Student> allStudents = studentService.getAllStudents();
			System.out.println(allStudents);
			break;
		}
		}while(status);
		sc.close();
		
		
	}

}
