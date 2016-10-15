package com.niit.Model;

import java.util.Date;

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
	
	private int fid;
	
	@NotEmpty(message="forum Title is not empty")
	private String ftitle;
	
	@NotEmpty(message="forumTitleis not empty")
	private String fcontent;
	
	private Date fcreationdate;
	
	private  String  username;
	
	@NotEmpty(message="forum Status is not empty")
	private String  fstatus;
	
	private String  category ;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFtitle() {
		return ftitle;
	}

	public void setFtitle(String ftitle) {
		this.ftitle = ftitle;
	}

	public String getFcontent() {
		return fcontent;
	}

	public void setFcontent(String fcontent) {
		this.fcontent = fcontent;
	}

	public Date getFcreationdate() {
		return fcreationdate;
	}

	public void setFcreationdate(Date fcreationdate) {
		this.fcreationdate = fcreationdate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFstatus() {
		return fstatus;
	}

	public void setFstatus(String fstatus) {
		this.fstatus = fstatus;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
	
	
	


}
