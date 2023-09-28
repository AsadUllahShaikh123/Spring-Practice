package com.spring.loose_coupling;

import java.util.List;

public class StudentImp implements StudentDao {

	public void insert(Student student) {
		System.out.print("Name : " + student.getName() + " Address : " + student.getAddress());
		System.out.println("insert into Student");		
	}

	public void update(Student student) {
		System.out.print("Name : " + student.getName() + " Address : " + student.getAddress());
		System.out.println("update student set name=?, address=? ");		
	}

	public void delete(int id) {
		System.out.println("delete student where id = ? ");		
	}

	public Student getStudentById(int id) {
		System.out.println("Select * from student where id = ? ");
		return null;
	}

	public List<Student> getAllStudents() {
		System.out.println("Select * from Student");
		return null;
	}

}
