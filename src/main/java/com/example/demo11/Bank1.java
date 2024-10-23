package com.example.demo11;

public class Bank1 extends BasicInfo{
	private String branchTitle;

	public Bank1() {
		super();
	}

	public Bank1(String branchTitle,String id, String name) {
		super(id, name);
		this.branchTitle = branchTitle;
	}

	public String getBranchTitle() {
		return branchTitle;
	}
	


}
