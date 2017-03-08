package kr.or.dgti.jdbc.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionFactory {
	private static final ConnectionFactory instence = new ConnectionFactory();

	public static ConnectionFactory getInstence() {
		return instence;
	}
	
	

	public Connection createConnection(){
		Connection connection = null;
		String url="jdbc:mysql://localhost:3306/mybatis";
		String user="user_mybatis";
		String password ="rootroot";
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
}
