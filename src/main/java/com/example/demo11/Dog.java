package com.example.demo11;

public class Dog {//在ClassTest測試
	//宣告屬性(特性)：品種、毛色、名字、年齡...
	String category;
	
	String color;
	
	String name;
	
	int age;
	
	//定義方法(行為)
	public void runrun() {
		System.out.println("正在跑");
	}
	
	public void runName() {
		System.out.println(name+"正在跑"); //可以直接用上面的name		
	}
	
	public void eat(String name) { //參數的名稱不要亂取，才不會呼叫(使用)時不知道要傳什麼進來
		//印出：球球 很愛吃變成 胖球球
		System.out.println(this.name+"很愛吃變成"+name);
		//this.是呼叫大括號外，且活在同類別中的
	}
	
	//方法的多載overload：方法名稱相同，但方法中的參數個數或是參數的資料型態不一樣(可 以參數的個數或是資料型態來區分相同名稱的方法)
	public void runrun(String name) {
		System.out.println(name+"正在跑");
	}
	

}
