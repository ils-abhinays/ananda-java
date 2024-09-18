package com.ananda.AnandaJava.body;

public class SecretBody {
	
	 public String name;
	 public String age;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "SecretBody [name=" + name + ", age=" + age + "]";
	}
	public SecretBody(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public SecretBody() {
		super();
		// TODO Auto-generated constructor stub
	}

}
