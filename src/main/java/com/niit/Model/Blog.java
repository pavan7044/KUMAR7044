package com.niit.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Entity
@Component
@Table

public class Blog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private int Bid;
	
	@NotEmpty(message="Blogtitle is not empty")
	private String Blogtitle;
	
	@NotEmpty(message="Blogcontect is not empty")
	private String Bcontent;
	
	private int userid;

	@NotEmpty(message="Blogcomment is not empty")	
	private String Blogcomment;
	
	private String Blogcreationdate;
	


	public int getBid() {
		return Bid;
	}


	public void setBid(int bid) {
		Bid = bid;
	}


	public String getBlogtitle() {
		return Blogtitle;
	}


	public void setBlogtitle(String blogtitle) {
		Blogtitle = blogtitle;
	}


	public String getBcontent() {
		return Bcontent;
	}


	public void setBcontent(String bcontent) {
		Bcontent = bcontent;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getBlogcomment() {
		return Blogcomment;
	}


	public void setBlogcomment(String blogcomment) {
		Blogcomment = blogcomment;
	}


	public String getBlogcreationdate() {
		return Blogcreationdate;
	}


	public void setBlogcreationdate(String blogcreationdate) {
		Blogcreationdate = blogcreationdate;
	}


	

	
	

}
