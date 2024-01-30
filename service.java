package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Student;

@Service
public interface StudentService {

	@Transactional
	public List<Student> getAllStudents();
	
	@Transactional
	public Student getStudentById(int id);
	
	@Transactional
	public void saveStudent(Student student);
	
	@Transactional
	public void deleteStudent(int id);
}
