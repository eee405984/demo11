package com.example.demo11;

//介面本身就是一個抽象的物件，所以關鍵字abstact可有可無
//完整的寫法：public abstact interface MyInterface
//介面是抽象物件，所以無法使用關鍵字new來生成實例
public interface MyInterface {
	
	//定義在介面中的屬性
	//1、權限只能是public或是nomodifier
	//2、必須要給初始值
	int NUM =10;
	public int NUM2 =10;
	//3、完整的寫法(或是被編譯後的寫法)如下
	//4、因為被定義成final，是常數，所以變數名稱要全大寫，不同英文字母間用底線串接
	public static final int NUM3 =10;
	
	//因為介面是一個抽象的物件，所以定義裡面的方法都 是抽象方法
	//只是關鍵字abstact一樣可省略，public abstact void fly() ;
	public void fly();
	
	//介面中可以有預設的方法實作內容(有大括號)，但一定要加上關鍵字default
	//預設方法不強制一定要重新定義
	public default void fly2(String name) {
		System.out.println(name + " flying");
	}
	
	//定義在介面中的static方法，一定要有實作內容
	//static方法無法被重新定義
	public static void fly3(String name) {
		System.out.println(name + " flying");
	}
}
