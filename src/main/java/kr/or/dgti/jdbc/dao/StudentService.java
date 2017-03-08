package kr.or.dgti.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
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
	public int insertStudent(Student student) {
		Connection connection =ConnectionFactory.getInstence();
		PreparedStatement pstmt = null;
		String sql="insert into student values(?,?,?,?)";
		int res=-1;
		try {
			pstmt= connection.prepareStatement(sql);
			pstmt.setInt(1, student.getStudId());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getEmail());
			pstmt.setTimestamp(4, new Timestamp(student.getDob().getTime()));
			res=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.printf("중복학생존재", student);
			e.printStackTrace();
		}finally{
			JdbcUtill.close(pstmt);
			
		}
		return res;
		
	}

	@Override
	public void deleteStudent(int studId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Student> findAllStudent() {
		Connection connection = ConnectionFactory.getInstence();
		List<Student> list = new ArrayList<>();
		String sql= "select stud_id,name,email,dob from student";
		
		try(PreparedStatement pstmt =connection.prepareStatement(sql);
				ResultSet rs= pstmt.executeQuery();){
			while(rs.next()){
				
				list.add(getsudent(rs));
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return list;
	}



	

	private Student getsudent(ResultSet rs) throws SQLException {
		int studId = rs.getInt("stud_id");
		String name= rs.getString("name");
		String email= rs.getString("email");
		Date dob = rs.getDate("dob");
		return new Student(studId, name, email, dob);
	}

}
