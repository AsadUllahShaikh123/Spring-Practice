package com.spring.annotations;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.annotations")
@PropertySource("com/spring/annotations/college-info.properties")
public class Config {
	
//
//	@Bean
//	public Principal getPrincipal() {
//		return new Principal();
//	}
//	
//    @Bean
//    public MathTeacher getMathTeacher() {
//    	return new MathTeacher();
//    }
//    @Bean
//    public ScienceTeacher getScienceTeacher() {
//    	return new ScienceTeacher();
//    }
//	@Bean
//	public College getCollege() {
//		College college = new College();
//		college.setPrincipal(getPrincipal());
//		college.setTeacher(getScienceTeacher());
//		return college;
//	}
	
	
	

}
