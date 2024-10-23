package com.example.demo11;

public class Personlnfo extends BasicInfo{
	private int age;	
	private String city;

	public Personlnfo() {
		super();
	}

	public Personlnfo(int age, String city,String id, String name) {
		super(id, name);
		this.age = age;
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}
	

	

}
