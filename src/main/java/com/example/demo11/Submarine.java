package com.example.demo11;

public class Submarine extends Boat implements Dive {

	@Override
	public void diving() {
		System.out.println("���");
	}

	@Override
	public void moving() {
		System.out.println("�b��");
	}
	
	public void moving2() {
		System.out.println("�b��");
	}
	

}
