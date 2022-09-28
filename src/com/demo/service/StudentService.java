package com.demo.service;

import java.util.*;

import com.demo.models.Student;

public interface StudentService {
	
	public String insertStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(int id);
	
	

}
