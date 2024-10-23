package com.example.demo11;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class ClassTest {
	@Test
	public void dogTest() {
		//使用關鍵字new來建立實例(instance)(實際建立(new)的個體) (創建一隻我的狗)
		Dog myDog=new Dog();
		System.out.println("我家狗的品種："+myDog.category); //預設值
		System.out.println(myDog.age);
		//設定每個實例不同的屬性
		myDog.category="臘腸狗";
		myDog.color="奶油色";
		myDog.name="球球";
		myDog.age=7;		
		System.out.println("我家狗的品種："+myDog.category);
		
		//使用方法(行為)
		myDog.runrun();
		myDog.runName();
		myDog.eat("胖球球");		
	}
	
	@Test
	public void bankTest() {
		Bank user1=new Bank();
		//設定私有屬性的資料
		user1.setUser("王一一");
		user1.setBalance(1000);
		
		user1.deposit(-11);
	}
	
	@Test
	public void bankbankTest() {
		Bank bank1=new Bank();
		Bank bank2=new Bank();		
		//印出記憶體位址(new出來的)
		System.out.println(bank1);
		//類別：==為比較記憶體位址
		System.out.println(bank1==bank2); //false
		Bank bank3=bank1;
		//bank3和bank1指向同個記憶體位址
		System.out.println(bank1==bank3); //true
		
		//String的宣告與比較：用new的會是新記憶體位址，用=附值會在字串池裡找找看原本有無該值(字串池裡的是可以重複利用的字串)
		String str1="A";
		String str2="A";
		String str3=new String("A");
		System.out.println(str1+str2+str3); //AAA
		System.out.println(str1==str2); //true
		System.out.println(str2==str3); //false
		System.out.println(str2.equalsIgnoreCase(str3)); //所以String的比較用.equals()或是.equalsIgnoreCase()
	}
	
	@Test
	public void changedparameterTest() {
		Bank bank=new Bank() {};
		bank.changedparameter2("銀行","TTA","aaa");
	}
	
	@Test//遞迴 階乘(5*4*3*2*1)
	public int factorialTest(int n) {
		if(n==1) { //終止條件
			return 1;
		}else {
			return(n*factorialTest(n-1));
		}
	}
	
	@Test
	public void bankTest2() {
		//預設建構方法
		Bank bank = new  Bank();
		bank.setBranch("TTA");
		bank.setUser("王");
		bank.setBalance(1000);
		//用帶有參數的建構方法如下
		Bank bank2= new Bank("TTA","王",1000);
	}
	
	@Test
	public void bankTest3() {
		//staticMethod是靜態方法，可以直接透過 類別名稱.方法名稱 呼叫
		Bank.staticMethod();
		//withdraw是一般方法，必須先把類別new出來才能呼叫
		Bank bank=new Bank();
		bank.withdraw(100);
		
		Math.random();
		Random r=new Random();
		r.nextInt();
	}
	


	
	

}
