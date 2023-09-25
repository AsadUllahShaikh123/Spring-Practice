package com.spring_jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class Config {

	@Bean
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
		JdbcTemplate jdbc = new JdbcTemplate(getDataSource());		
		return jdbc;
	}
}
