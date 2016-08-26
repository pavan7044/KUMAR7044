package com.niit.model;

import javax.persistence.Column;
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
public class User {
	
	
		@Id	
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uid;
		@NotEmpty(message="first name cannot be empty")
    private String ufirstname;
		@NotEmpty(message="last name cannot be empty")
	private String ulastname;
		@NotEmpty(message="username cannot be empty")
	private String username;
		@NotEmpty(message="password cannot be empty")
	private String upassword;
		@NotEmpty(message="confirm password cannot be empty")
	transient private String uconfirmpassword;
		@NotEmpty(message="Email cannot be empty")
	private String uemail;
	
		@NotEmpty(message="phone number cannot be empty")
	private String uphonenumber;
    

    @Column(name="enabled")
    private boolean isEnabled;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUfirstname() {
		return ufirstname;
	}
	public void setUfirstname(String ufirstname) {
		this.ufirstname = ufirstname;
	}
	public String getUlastname() {
		return ulastname;
	}
	public void setUlastname(String ulastname) {
		this.ulastname = ulastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUconfirmpassword() {
		return uconfirmpassword;
	}
	public void setUconfirmpassword(String uconfirmpassword) {
		this.uconfirmpassword = uconfirmpassword;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUphonenumber() {
		return uphonenumber;
	}
	public void setUphonenumber(String uphonenumber) {
		this.uphonenumber = uphonenumber;
	}
	public boolean isEnabled() {
		return isEnabled;
	}
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	
	
	

}
