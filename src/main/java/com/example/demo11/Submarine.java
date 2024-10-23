package com.example.demo11;

public class Submarine extends Boat implements Dive {

	@Override
	public void diving() {
		System.out.println("潛水");
	}

	@Override
	public void moving() {
		System.out.println("在動");
	}
	
	public void moving2() {
		System.out.println("在動");
	}
	

}
