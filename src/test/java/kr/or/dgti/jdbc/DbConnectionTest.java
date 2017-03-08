package kr.or.dgti.jdbc;


import java.sql.Connection;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


import kr.or.dgti.jdbc.utill.ConnectionFactory;

public class DbConnectionTest {
	private static Connection connection;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		connection= ConnectionFactory.getInstence();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		connection = null;
	}

	@Test
	public void test() {
		Assert.assertNotNull(connection);
	}

}
