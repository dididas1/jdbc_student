package kr.or.dgti.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;



import kr.or.dgti.jdbc.dto.Student;
import kr.or.dgti.jdbc.utill.ConnectionFactory;
import kr.or.dgti.jdbc.utill.JdbcUtill;

public class StudentService implements StudentDao {
	
	private static final StudentService insetence = new StudentService();
	
	
	public StudentService() {}

	public static StudentService getInsetence() {
		return insetence;
	}

	@Override
	public Student findStudentById(int studId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertStudent(Student student) {
		Connection connection =ConnectionFactory.getInstence().createConnection();
		PreparedStatement pstmt = null;
		String sql="insert into student values(?,?,?,?)";
		try {
			pstmt= connection.prepareStatement(sql);
			pstmt.setInt(1, student.getStudId());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getEmail());
			pstmt.setDate(4, (Date) student.getDbo());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.err.printf("중복학생존재", student);
			e.printStackTrace();
		}finally{
			JdbcUtill.close(pstmt);
			JdbcUtill.close(connection);
		}
		
	}

	@Override
	public void deleteStudent(int studId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
