package kr.or.dgti.jdbc.dto;

import java.util.Date;

public class Student {
	private int studId;
	private String name;
	private String email;
	private Date dob;
	public int getStudId() {
		return studId;
	}
	
	
	public Student() {
		
	}
	


	public Student(int studId, String name, String email, Date dob) {
		super();
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return String.format(" [studId=%s, name=%s, email=%s, dbo=%s]", studId, name, email, dob);
	}
	
	
}
