package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Component
@Table


public class Product {
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int ptid;
	private String ptname;
	private String ptcolor;
	private String ptmodel;
	private int ptprice;
	private String ptquantity;
	
	@Transient
	private MultipartFile img;
	
	public MultipartFile getImg() {
		return img;
	}
	public void setImg(MultipartFile img) {
		this.img = img;
	}
	
	
	public int getPtid() {
		return ptid;
	}
	public void setPtid(int ptid) {
		this.ptid = ptid;
	}
	public String getPtname() {
		return ptname;
	}
	public void setPtname(String ptname) {
		this.ptname = ptname;
	}
	public String getPtcolor() {
		return ptcolor;
	}
	public void setPtcolor(String ptcolor) {
		this.ptcolor = ptcolor;
	}
	public String getPtmodel() {
		return ptmodel;
	}
	public void setPtmodel(String ptmodel) {
		this.ptmodel = ptmodel;
	}
	public int getPtprice() {
		return ptprice;
	}
	public void setPtprice(int ptprice) {
		this.ptprice = ptprice;
	}
	public String getPtquantity() {
		return ptquantity;
	}
	public void setPtquantity(String ptquantity) {
		this.ptquantity = ptquantity;
	}

	
	


}