package com.demo.sevice.impl;

import java.util.ArrayList;
import java.util.List;

import com.demo.models.Student;
import com.demo.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	List<Student> students = new ArrayList<Student>();

	@Override
	public String insertStudent(Student student) {
		this.students.add(student);
		return "Student Inserted Successfully!!";
	}

	@Override
	public List<Student> getAllStudents() {
		
		return students;
	}

}
