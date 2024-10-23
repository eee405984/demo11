package com.example.demo11;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

//專案框架下載
//更改框架版本
//@SpringBootTest  先從程式入口點開始運作，會先完成程式的基本配置，在執行測試內容

public class HelloTest {
	// 公有類別(public class)一java程式只有一個，必須和程式檔案名稱一樣

	@Test // 要使用單元測試必須加上此annotation
	public void helloTest() {
		// 存取權限 回傳資料型態 方法名稱(參數){實作內容}
		// void是不回傳資料
		System.out.println("Hello world");
		// println是列印
		// syso + alt + / : 即可快速呼叫出系統列印
		// ""是字串=單純的文字，不是在寫程式(沒有功能性)
	}

	@Test
	public void helloworld() {
		System.out.println(this.helloMaker("1233"));
		// this是用於呼叫方法大括號外的方法或變數時，才需要添加
		// 呼叫方法時，不論有沒有傳入參數，都必須加上小括號
		// 如this.大括號外的方法名稱(參數)
		System.out.println(this.helloMaker2("0", "1", "2"));
	}
	

	public String helloMaker(String inString) {
		// 前面那個回傳值資料型態String是傳出去的；()裡參數是接進來的型態
		// String是一個存儲東西的空間(像一個要提供的公式)
		// 因為宣告方法時，有要求回傳字串，故必須return字串，才不會報錯
		return inString + "world";
	}
	

	public String helloMaker2(String... aa) {
		return aa[1] + "world";
		// 在參數名稱前面加上...是陣列=可輸入不只一個參數，而傳入的參數以陣列(array，資料組成的一長列)的方式存儲
		// 此時的參數名稱會代表此陣列的存儲位置(記憶體空間)，要取用陣列內的內容須加上[]=指定陣列的第幾個(通常從0開始)
	}

	@Test
	public void staticFinalTest() {
		System.out.println(Math.PI);
		// 按ctl+點擊：可查看該物品的詳細資訊
		// 因為PI被加上了static的前置，所以不能再被修改
		// 因為PI本身有static，所以不需要先創建才能使用，而是大家都存取同一個記憶體空間裡的值
		// 創建是指建立一個記憶體空間給該物件
	}

	// 宣告變數
	@Test
	// 宣告數值(整數通常用int、小數通常用double)
	// byte
	public void variableTest() {
		byte x = (byte) 2;
		// 強制轉型：值前面加上(要轉型成的資料型態)
		short y = 3;
		// 黃色底線=提醒你沒有用到
		int c = 128;
		long d = 5;
		System.out.println(x);
		float g = (float) 0.5; // 浮點數=小數
		double h = 0.5;
		char i = '1'; // 字元：用單引號，只能放一個字，預設值為' '(空的單引號)
		char l = 64; // 當把數字放入char的容器中時，程式會自動解讀為文字編碼，找到該數字相對應的字元(ASCII表)
		System.out.println(l);
		// 布林值：比較常用，性別常用true代表男生，false代表女生
		boolean j = true;
		boolean k = false;
	}

	@Test  //不同的資料型態
	public void llTest() {
		System.out.println(2000000000000L);
		// 直接打整數，程式預設的型態是int，如果要打超過20億的整數=長整數，要在數字後面加L
		System.out.println(3.14159268F);
		// 浮點數，程式預設的型態是double(雙精度浮點數，到小樹下15位數)，如果要打小數點下7為數=單精度浮點數，要在數字後面加f
		System.out.println("kuha");
		System.out.println('a');
	}
	
	@Test  //使用變數(步驟：宣告變數_指定資料_使用資料)
	public void ooTest(){
		int x;  //宣告一個整數變數x，x的裡面就只能夠放int型態的資料
		x=3;
		System.out.println(x);
		x=40;  //整數變數x裡面裝的資料可以變化(在後面的資料會覆蓋先前的資料)
		      //注意錯誤寫法int x=3; int x=40;(第一個意味著宣告整數變數x裡放著3，後面那一個就無法成立了)
		System.out.println(x);
		float n=3.7489324732894F;  //太多位數後加f才是符合n的資料型態，才可以放進n裡面
				System.out.println(n);
	}

	@Test
	public void Test33() {
		// 容器賦值的流程
		int res = 5 / 2;
		System.out.println(res);
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		// 當沒有小數點時，程式會自動將數字理解為int(整數)，因此計算的結果也會用整數方式呈現
		// 而只要有任何一數是小數，程式就能夠以小數的方式去計算出結果
		double res2 = (double) (5 / 2);
		// 程式計算時先算5/2，再將除出來的數轉為小數，最後塞入小數的容器中，所以結果是2.0
		// 程式會先執行小括號(如5/2沒括號時，先將5強制轉型成小數5.0)，且先算右邊
		System.out.println(res2);
	}

	@Test
	public void hardCodeTest() {
		int sum = 1 + 3;
		System.out.println(sum);
		// 上面是hardcode=把他寫死了(答案永遠是4)，不易未來維護、利用修改

		int add1 = 4;
		int add2 = 5;
		// 下面是比較好的，將實作內容用兩個變數包裝起來，方便為來修改值的內容(只要修改變數即可)
		int sum2 = add1 + add2;
		System.out.println(sum2);

		// 省略掉只使用一次的sum2，稱為匿名變數
		System.out.println(add1 + add2);
	}

	@Test
	public void stringTest() {
		int a = 1;
		int b = 1;
		System.out.println(a == b);

		String c = "a";
		String d = "a";
		String e = "a";
		System.out.println(c == d);
		System.out.println(e);
		System.out.println(c == e);
		/* = 是宣告；== 是判斷是否相同(實際上是判斷記憶體位置是否一樣)
		當使用『String 變數名稱 = new String(內容);』時，裝有相同內容、但分別新增的兩個變數名稱
		，在使用「==」比較時，指向不同的記憶體位置，故結果不會相等
		當使用『String 變數名稱 = "內容"; 』時
		 結論：String的比較盡量不要用==*/

		int a1 = 2;
		Integer a2 = null;
		// 大小寫型態代表意義不同
	}
	

	

}
