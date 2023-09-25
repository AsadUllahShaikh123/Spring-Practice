package com.spring_jdbc.crud;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		JdbcTemplate jdbc = context.getBean("jdbc",JdbcTemplate.class);
		
		// ============== insert Option  ============= 
		
//		String sql = "insert into student (name, address) values(?,?)";
//		
//		int inserted = jdbc.update(sql,"Mazhar","moro");
//		System.out.print("inserted " + inserted);
		
		
		
	}
}
