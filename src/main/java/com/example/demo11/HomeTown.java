package com.example.demo11;

public class HomeTown {
	//屬性
	private String city;
	
	private String state;
	
	private String country;

	public HomeTown() {
		super();
		// TODO Auto-generated constructor stub
	}

	//建構方法
	public HomeTown(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	//一般方法：屬性的get方法
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}
	
	

}
