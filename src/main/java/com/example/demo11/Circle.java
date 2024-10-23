package com.example.demo11;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("畫圈圈");
	}

	//被繼承的Shape類別中，因為有定義抽象方法draw1()，所以這個方法必須要被重新定義
	@Override
	public void draw1() {
		System.out.println("畫圈圈，一圈又一圈");
	}
	
	//常數：變數名稱全大寫，不同英文字母間用底線串接
	public final int MAX_NUMBER = 10 ;
	//一般的屬性變數，用小駝峰方式命名變數
	private String minNumber;
	

}
