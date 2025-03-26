package com.learningstd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class eteacher
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String Fname;
	private String Lname;
	private String email;
	private String phone ;
	private String password;
	private String cpasswodr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpasswodr() {
		return cpasswodr;
	}
	public void setCpasswodr(String cpasswodr) {
		this.cpasswodr = cpasswodr;
	}
	public eteacher(int id, String fname, String lname, String email, String phone, String password, String cpasswodr) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.cpasswodr = cpasswodr;
	}
	public eteacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
