package kr.or.dgti.jdbc.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionFactory {
	private static final ConnectionFactory instence = new ConnectionFactory();

	public static Connection getInstence() {
		return instence.createConnection();
	}
	
	

	public ConnectionFactory() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.printf("MySql Driver not Fount");
			System.exit(-1);
		}	
		
	} //end of class



	private Connection createConnection(){
		Connection connection = null;
		String url="jdbc:mysql://localhost:3306/mybatis";
		String user="user_mybatis";
		String password ="rootroot";
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
		
	}
	
	
}
