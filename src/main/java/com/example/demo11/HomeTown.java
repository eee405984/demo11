package com.example.demo11;

public class HomeTown {
	//�ݩ�
	private String city;
	
	private String state;
	
	private String country;

	public HomeTown() {
		super();
		// TODO Auto-generated constructor stub
	}

	//�غc��k
	public HomeTown(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	//�@���k�G�ݩʪ�get��k
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
