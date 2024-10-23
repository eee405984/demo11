package com.example.demo11;

public class Father {
	private String name;

	public Father() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Father(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void walk() {
		System.out.println(name + " is walking!");
	}

}
