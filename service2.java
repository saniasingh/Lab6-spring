package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.StudentDAO;
import com.spring.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public List<Student> getAllStudents() {
		return studentDAO.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		return studentDAO.findById(id).orElse(null);
	}

	@Override
	public void saveStudent(Student student) {
		studentDAO.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentDAO.deleteById(id);
	}
}
