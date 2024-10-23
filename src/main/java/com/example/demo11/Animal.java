package com.example.demo11;

public class Animal {
	private String name;

	protected int age;

	// 篶よ猭璶策篋箇砞篶よ猭(superclassê)篶Τ把计(fieldsê)
	public Animal() {
		super(); //㊣Object
		//篶よ猭い璝Τ㊣摸 super() よ猭ぃ恨琌箇砞临琌盿Τ把计篶よ猭
		//ㄤ緇祘Α絏常糶 super() よ猭ぇ
		System.out.println("硂琌摸");
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println(name + "狥﹁");
	}

	public void sleep() {
		System.out.println(name + "埂何");
	}

}
