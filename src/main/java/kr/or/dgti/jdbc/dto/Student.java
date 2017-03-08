package kr.or.dgti.jdbc.dto;

import java.util.Date;

public class Student {
	private int studId;
	private String name;
	private String email;
	private Date dbo;
	public int getStudId() {
		return studId;
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
	public Date getDbo() {
		return dbo;
	}
	public void setDbo(Date dbo) {
		this.dbo = dbo;
	}
	@Override
	public String toString() {
		return String.format(" [studId=%s, name=%s, email=%s, dbo=%s]", studId, name, email, dbo);
	}
	
	
}
