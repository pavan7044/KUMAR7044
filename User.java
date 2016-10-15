package com.niit.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Entity
@Component
@Table
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
private int userid;

@NotEmpty(message="user id is not empty")
private String Username;

@NotEmpty(message="Email id is not empty")
private String email;

@NotEmpty(message="Password id is not empty")
private String password;


private String authority;


private String role;

@NotEmpty(message="Address is not empty")
private String Address;

@NotEmpty(message="Phone number is not empty")
private String phno;

@Column(name="enabled")
private boolean isEnabled;

private boolean isAdmin;


public boolean isAdmin() {
	return isAdmin;
}

public void setAdmin(boolean isAdmin) {
	this.isAdmin = isAdmin;
}

@Transient
private MultipartFile img;

@NotEmpty(message="Location is not empty")
private String location;

public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
}

public String getUsername() {
	return Username;
}

public void setUsername(String username) {
	Username = username;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public String getPhno() {
	return phno;
}

public void setPhno(String phno) {
	this.phno = phno;
}

public boolean isEnabled() {
	return isEnabled;
}

public void setEnabled(boolean isEnabled) {
	this.isEnabled = isEnabled;
}



public MultipartFile getImg() {
	return img;
}

public void setImg(MultipartFile img) {
	this.img = img;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getAuthority() {
	return authority;
}

public void setAuthority(String authority) {
	this.authority = authority;
}














}
