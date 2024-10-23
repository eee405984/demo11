package com.example.demo11;

//抽象類別無法使用new來建立實例
public abstract class Shape {
	// 抽象類別中可以定義一般方法和抽象方法

	// 定義""一般""方法
	// 一般方法可以被定義在一般類別或是抽象類別中
	public void draw() {
	}

	// 抽象方法：
	// 1、不能有實作內容(就是不能有大括號)
	// 2、分號結尾
	// 3、抽象方法只能被定義在抽象類別中
	// 4、抽象方法必須要被重新定義(因為沒有實作類別，所以必須透過重新定義來給予實作內容)
	public abstract void draw1();

}
