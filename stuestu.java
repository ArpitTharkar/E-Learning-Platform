package com.learningstd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class stuestu
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String Fsname;
	private String Lsname;
	private String semail;
	private String sphone ;
	private String Classr;
	private String spassword;
	private String scpasswodr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFsname() {
		return Fsname;
	}
	public void setFsname(String fsname) {
		Fsname = fsname;
	}
	public String getLsname() {
		return Lsname;
	}
	public void setLsname(String lsname) {
		Lsname = lsname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getClassr() {
		return Classr;
	}
	public void setClassr(String classr) {
		Classr = classr;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	public String getScpasswodr() {
		return scpasswodr;
	}
	public void setScpasswodr(String scpasswodr) {
		this.scpasswodr = scpasswodr;
	}
	public stuestu(int id, String fsname, String lsname, String semail, String sphone, String classr, String spassword,
			String scpasswodr) {
		super();
		this.id = id;
		Fsname = fsname;
		Lsname = lsname;
		this.semail = semail;
		this.sphone = sphone;
		Classr = classr;
		this.spassword = spassword;
		this.scpasswodr = scpasswodr;
	}
	public stuestu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
