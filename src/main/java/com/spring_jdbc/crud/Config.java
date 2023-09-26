package com.spring_jdbc.crud;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {

	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("Admin");
		return dataSource;
	}
	
	@Bean(name="jdbc")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate(getDataSource());
		return template;
	}
	
	@Bean(name="std_dao")
	public StudentDao getStudentDao() {
		StudentDao dao = new StudentDao(getJdbcTemplate());
		return dao;
	}
}
