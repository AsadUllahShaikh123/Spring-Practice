package com.spring.loose_coupling;

import java.util.List;

public interface StudentDao {

	public void insert(Student student);
	public void update(Student student);
	public void delete(int id);
	public Student getStudentById(int id);
	public List<Student> getAllStudents();
}
