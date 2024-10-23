package com.example.demo11;

public class Employee2 extends HomeTown {

	private String id;

	private String name;

	private int age;

	private String gender;

	public Employee2() {
		super();
	}

	public Employee2(String id, String name, int age, String gender, String city, // 註解符號可以拿來斷行
			String state, String country) {
		super(city, state, country);
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}
	
	

}
