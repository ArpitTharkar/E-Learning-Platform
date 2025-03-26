package com.learningstd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class tcoures 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int srno;
	private String sub;
	private String subdescrit;
	private String uploaddate;
	private String duedate;
	private String classstu;
	private String dive;
	private String uploadby;
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getSubdescrit() {
		return subdescrit;
	}
	public void setSubdescrit(String subdescrit) {
		this.subdescrit = subdescrit;
	}
	public String getUploaddate() {
		return uploaddate;
	}
	public void setUploaddate(String uploaddate) {
		this.uploaddate = uploaddate;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public String getClassstu() {
		return classstu;
	}
	public void setClassstu(String classstu) {
		this.classstu = classstu;
	}
	public String getDive() {
		return dive;
	}
	public void setDive(String dive) {
		this.dive = dive;
	}
	public String getUploadby() {
		return uploadby;
	}
	public void setUploadby(String uploadby) {
		this.uploadby = uploadby;
	}
	public tcoures(int srno, String sub, String subdescrit, String uploaddate, String duedate, String classstu,
			String dive, String uploadby) {
		super();
		this.srno = srno;
		this.sub = sub;
		this.subdescrit = subdescrit;
		this.uploaddate = uploaddate;
		this.duedate = duedate;
		this.classstu = classstu;
		this.dive = dive;
		this.uploadby = uploadby;
	}
	public tcoures() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
