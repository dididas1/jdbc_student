package kr.or.dgti.jdbc;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgti.jdbc.dao.StudentService;
import kr.or.dgti.jdbc.dto.Student;

public class StudentServiceTest {
	private static StudentService studentservice;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentservice = studentservice.getInsetence();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentservice = null;
	}

	@Test
	public void testinsertStudent() {
		Student insStudent = new Student(1, "김두환", "di@naver.com", new Date());
		int res= studentservice.insertStudent(insStudent);
		Assert.assertEquals(1, res);
	}
	@Test
	public void testfindAllStudent(){
		List<Student> list= studentservice.findAllStudent();
		for(Student s:list){
			System.out.println(s);
		}
		Assert.assertNotNull(list);
	}

}
