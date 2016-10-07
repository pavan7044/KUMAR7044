package com.niit.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table

public class Forum {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int Fid;
	
	@NotEmpty(message="Forum Title is not empty")
	private String Ftitle;
	
	@NotEmpty(message="ForumTitleis not empty")
	private String Fcontent;
	
	private String Fcreationdate;
	
	private  int userid;
	
	@NotEmpty(message="Forum Status is not empty")
	private String  Fstatus;
	
	private String  category ;

	public int getFid() {
		return Fid;
	}

	public void setFid(int fid) {
		Fid = fid;
	}

	public String getFtitle() {
		return Ftitle;
	}

	public void setFtitle(String ftitle) {
		Ftitle = ftitle;
	}

	public String getFcontent() {
		return Fcontent;
	}

	public void setFcontent(String fcontent) {
		Fcontent = fcontent;
	}

	public String getFcreationdate() {
		return Fcreationdate;
	}

	public void setFcreationdate(String fcreationdate) {
		Fcreationdate = fcreationdate;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFstatus() {
		return Fstatus;
	}

	public void setFstatus(String fstatus) {
		Fstatus = fstatus;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	

}
