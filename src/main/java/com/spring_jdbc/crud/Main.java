package com.spring_jdbc.crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring_jdbc.Student;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		JdbcTemplate jdbc = context.getBean("jdbc",JdbcTemplate.class);
		
		// ============== insert Operation  ============= 
		
//		String sql = "insert into student (name, address) values(?,?)";
//		
//		int inserted = jdbc.update(sql,"Mazhar","moro");
//		System.out.print("inserted " + inserted);
		
		
		// =========== Update operation ===========
		
//		String sql = "update student set name =?, address =? where id =? ";
//		
//		int updated = jdbc.update(sql,"Asadullah","moro",1);
//		
//		System.out.print("updated : " + updated);
		
		// =========== Delete Operation ============ 
//		
//		String sql = " delete from student where id = ? ";
//		int deleted = jdbc.update(sql,1);
//		System.out.print("Deleted " + deleted);
		
		// Fetched All Data from the database 
		
//		String sql = " select * from student " ;
//		
		RowMapper<Student> rowMapper = new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setAddress(rs.getString("address"));
				return student;
			}
			
		};
//		
//		List<Student> students = jdbc.query(sql,rowMapper );
//		for(Student student : students) {
//		
//		System.out.print(student.getId()+ " "  + student.getName() + " " + student.getAddress());
//		System.out.println();		
//		
//		}
		
		
	}
}
