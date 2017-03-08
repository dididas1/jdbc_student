package kr.or.dgti.jdbc;

import java.sql.Connection;

import kr.or.dgti.jdbc.dao.StudentService;
import kr.or.dgti.jdbc.dto.Student;
import kr.or.dgti.jdbc.utill.ConnectionFactory;

public class TestMain {
	public static void main(String[] args) {
	
		Connection connection =  ConnectionFactory.getInstence().createConnection();
		System.out.println(connection);
		
		StudentService service = StudentService.getInsetence();
		Student std= new Student();
		std.setStudId(1);
		
	}
}
