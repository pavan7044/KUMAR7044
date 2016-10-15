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

public class Blog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private int bid;
	
	@NotEmpty(message="blogtitle is not empty")
	private String blogtitle;
	
	@NotEmpty(message="blogcontect is not empty")
	private String bcontent;
	
	private String username;


	
	private Date blogcreationdate;



	public int getBid() {
		return bid;
	}



	public void setBid(int bid) {
		this.bid = bid;
	}



	public String getBlogtitle() {
		return blogtitle;
	}



	public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	}



	public String getBcontent() {
		return bcontent;
	}



	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public Date getBlogcreationdate() {
		return blogcreationdate;
	}



	public void setBlogcreationdate(Date blogcreationdate) {
		this.blogcreationdate = blogcreationdate;
	}
	

	

	

	
	

}
