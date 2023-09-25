package com.spring_jdbc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_jdbc/config.xml");
		
		JdbcTemplate jdbc = context.getBean("jdbc_template",JdbcTemplate.class);
		System.out.print(jdbc.getDataSource().getConnection());
	}
}
