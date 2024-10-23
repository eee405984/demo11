package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ExtendsTest {
	@Test
	public void animalTest() {
		Animal ani=new Animal();
		ani.setName("ANI");
		ani.eat();
		ani.sleep();
	}
	
	@Test
	public void animalTest2() {
		Animal ani=new Animal("ANI",5); //帶有參數的建構方法
		ani.eat();
		ani.sleep();
	}	
	
	@Test
	public void birdTest() {
		Bird bird=new Bird();
		bird.setName("BIRD");
		bird.eat();
		bird.sleep();
		bird.flying();
	}

	@Test
	public void birdTest2() {
		Bird bird=new Bird("BIRD",5);
		bird.eat();
		bird.sleep();
		bird.flying();
	}
	
	@Test
	public void fatherTest() {
		Father father=new Father("FA");
		father.walk();
	}
	
	@Test
	public void sonTest() {
		Son son=new Son("SON");
		son.playBall();
	}
	
	@Test
	public void birdTest3() {
		//雖然接回來的資料型態是父類別，但因為new出來的實例是子類別，所以本質上就是子類別
		Animal bird=new Bird("BIRD",5);
		// eat()和sleep() 執行的會是在子類別中重新定義的實作內容
		bird.eat();
		bird.sleep();
		//以下方法無法被呼叫，因為沒有被定義在父類別中
//		bird.flying();
		//綜合以上，當新建立出來的子類別實例，其資料型態是父類別時：
		//1、只能呼叫定義在父類別中的方法
		//2、當子類別有重新定義父類別的方法時，執行的會是子類別的實作內容
		
	}
	
	@Test
	public void birdTest4() {
		Bird bird=new Bird("BIRD",5);
		//執行的是定義在bird中的實作內容
		bird.flying();
		//重新定義 flying() 的方法
		//1、在建立新的實例時直接給予新的實作內容，即加上大括號
		//2、大括號要寫在分號之前，且結尾一定要有分號
		//3、重新定義的實作內容就僅此在這次執行
		//4、 @Override 可有可無，但建議加
		Bird bird2=new Bird("BIRD",5) {
			@Override
			public void flying() {
				System.out.println("笨鳥亂飛");
			}			
		};
		bird2.flying();
		bird.flying();
	}
	
	@Test
	public void interFaceTset() {
		MyInterface my=new MyInterfaceImpl();
		System.out.println(my.NUM);
		System.out.println(MyInterface.NUM);
	}
	
	@Test
	public void interfaceTest2() {
//		Person person=new Person();
//		Human human=new Human();
//		Car car=new Car();
//		person.running();
//		human.running();
//		car.running();
		
		Submarine sub=new Submarine();
		sub.diving();
		sub.moving();
		sub.moving2();
		
		Boat boat=new Submarine();
		boat.moving();
		
	
	}


}
