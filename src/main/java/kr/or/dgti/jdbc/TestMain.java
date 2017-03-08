package kr.or.dgti.jdbc;

import java.sql.Connection;


import kr.or.dgti.jdbc.utill.ConnectionFactory;

public class TestMain {
	public static void main(String[] args) {
	
		Connection connection =  ConnectionFactory.getInstence();
		System.out.println(connection);
		
		
		
	}
}
