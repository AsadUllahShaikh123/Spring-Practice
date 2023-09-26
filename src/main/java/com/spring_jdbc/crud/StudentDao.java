package com.spring_jdbc.crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {

	private JdbcTemplate jdbc;

	public StudentDao(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public int insert(Student student) {
		int inserted = 0;

		String sql = "insert into student (name , address) values(?,?)";
		inserted = jdbc.update(sql, student.getName(), student.getAddress());
		return inserted;

	}

	public int update(Student student) {
		int updated = 0;

		String sql = "update student set name =? , address =? where id = ?";
		updated = jdbc.update(sql, student.getName(), student.getAddress(), student.getId());
		return updated;
	}

	public int delete(int id) {
		int deleted = 0;
		String sql = "delete from student where id = ? ";
		jdbc.update(sql, id);
		return deleted;
	}

	public RowMapper<Student> getRowMapper(){
		RowMapper<Student> rowMapper = new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setAddress(rs.getString("address"));
				return student;
			}

		};
		return rowMapper;
	}
	public Student getStudentById(int id) {
		Student student = null;
		String sql = "Select * from student where id = ? ";
	    student = jdbc.queryForObject(sql, getRowMapper(), id);
		return student;
	}

	public List<Student> getAllStudents() {
		List<Student> list = new ArrayList<Student>();
		String sql = "Select * from student ";
		
		list = jdbc.query(sql, getRowMapper());
		
		return list;
	}
}
