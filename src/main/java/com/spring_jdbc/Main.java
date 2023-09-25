package com.spring_jdbc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		// For config.xml Files 
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_jdbc/Config.java");
//		
//		JdbcTemplate jdbc = context.getBean("jdbc_template",JdbcTemplate.class);
//		
//		String sql = "insert into student (name, address) values (?,?)";
//		
//		int inserted = jdbc.update(sql, "Asad","Moro");
//		
//		System.out.println("Data inserted " + inserted);
		
		
		// For Java Config File 
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate template = context.getBean("jdbc",JdbcTemplate.class);
		
		String sql = "insert into student (name,address) values(?,?)";
		
		int inserted = template.update(sql,"Safdar","moro");
		System.out.println("Data Inserted Successfully");
	}
}
