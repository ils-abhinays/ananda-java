package com.ananda.AnandaJava.body;

public class ReqBody {
	   public String email;
	   public String name;
	   
	   public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ReqBody(String email, String name) {
		super();
		this.email = email;
		this.name = name;
	}
	public ReqBody() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "ReqBody [email=" + email + ", name=" + name + "]";
	}
	
}
