package com.niit.Model;

public class Message {
	
	
	private String message;
	  private int id;
	  
	  public Message() {
		  System.out.println("in Message class");
		    
	  }
	  
	  public Message(int id, String message) {
	    this.id = id;
	    this.message = message;
	  }

	  public String getMessage() {
	    return message;
	  }

	  public void setMessage(String message) {
	    this.message = message;
	  }

	  public int getId() {
	    return id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }


}
