package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {

	
}
