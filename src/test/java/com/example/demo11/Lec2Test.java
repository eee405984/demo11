package com.example.demo11;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Lec2Test {
	@Test // 複習
	public void reviewLec1() {
		int a;
		String b = "1111";
	}

	public void commentTest() {
		// 單行註解
		/*
		 * 多行註解
		 */
		System.out.println(this.e(0));
	}

	/**
	 * 文件註解
	 * 
	 * @param y 一般寫參數是什麼(傳出去的值)
	 * @return 一般寫回傳的值 文件註解：在呼叫方法的時候，可以看到(把游標移到呼叫的方法名稱上面)
	 */
	public String e(int y) {
		return null;
	}

	// 三元運算： 判斷式? 值1:值2 (如果判斷式是true回傳值1，如果false回傳值2)

	@Test // 前置運算、後置運算
	public void comdTest() {
		int a = 10;
		System.out.println(a++ * 10); // 先a*10，再a=a+1
		System.out.println(a);
		a = 10;
		System.out.println(++a * 10);// 先a=a+1，再a*10
		System.out.println(a); // a都還是=a+1
	}

	@Test // 求餘數運算子%
	public void modTest() {
		int tt = 10 % 3; // 10除以3餘1
		System.out.println(tt);
	}

	// 複合指定運算子 a+=b (a=a+b) 把重複的a省略，運算符號移到=前面

	@Test // 題目：a=a+9；a=a-1；a=5*a；a=b/5；a=a%b；a=b%a
	public void riuns() {
		int a = 1;
		int b = 10;
		System.out.println(a += 9);
		System.out.println(a--); // 印a--會先印出a，再a=a-1；印--a相反
		System.out.println(a *= 5);
		System.out.println(a = b / 5);
		System.out.println(a %= b);
		System.out.println(a = b % a);
	}

	@Test // 反向運算!(相反)；且&&(and，均為真)；或||(or，其一為真)；互斥^(xor，兩者相異)(在數字6)
	public void fhuewi() {
		boolean s = true;
		System.out.println(!s);
		System.out.println(1 == 1 || 1 != 1);
		System.out.println(1 == 1 && 1 != 1);
	}

	// 括號運算子>一元運算子>遞增遞減運算子>算術運算子(先乘除後加減)>比較運算子>邏輯運算子>指定運算子(=)

	@Test // 等差數列和
	public void hfsiu() {
		System.out.println(this.sum(1, 100));
	}

	/**
	 * @param start 起始值
	 * @param end   最終值
	 * @return 數列總和
	 */
	public int sum(int start, int end) {
		return (start + end) * (end - start + 1) / 2; // 匿名變數
	}
	// 縮排：往前shift+tab、往後tab

	@Test // 溫度轉換
	public void tem() {
		System.out.println(this.Ctem(28.3));
		System.out.println(this.Ftem(89));
	}

	/**
	 * @param a 攝氏溫度
	 * @return 轉換後的華氏溫度
	 */
	public double Ctem(double a) {
		return a * 9 / 5 + 32;
	}

	/**
	 * @param t 華氏溫度
	 * @return 轉換後的攝氏溫度
	 */
	public double Ftem(double t) {
		return (t - 32) * 5 / 9;
	}

	// for迴圈：for(初始值;判斷條件;迭代運算) { // 欲重複執行的程式主體 }

	@Test // for迴圈的等差數列和
	public void forQ() {
		System.out.println(this.egg(1, 100));
	}

	public int egg(int start, int end) {
		int sum = 0;
		for (int n = start; n <= end; n++) {
			sum = sum + n;
		}
		return sum;
	}

	// 巢狀for迴圈(for裡面又包括至少一個for)：for(初始值;判斷條件;迭代運算){for(初始值;判斷條件;迭代運算){// 程式主體 }}
	// 佔位符號：%d(整數) %s(字串) 先幫後面的資料佔好要佔的格數(填在%跟d中間)，讓版面整齊
	// printf：必須以字串開頭且不會自動換行(若要換行，需加上 \n )，且唯一能使用佔位符號
	@Test // 巢狀for迴圈 印九九乘法表
	public void forforTest() {
		for (int n = 1; n <= 9; n++) {// for迴圈1號
			for (int m = 1; m <= 9; m++) { // for迴圈2號
				System.out.printf("%d*%d=%2d  ", m, n, m * n);
			}
			System.out.printf("\n"); // =換行=System.out.println();
			/*
			 * 1號for迴圈開始跑第一圈(n=1)，2號跑9次【m=1，印出n*m=(用printf不換行)；m=2，印出n*m=...到m=9】，然後換行
			 * 然後1號開始第二圈(n=2)，2號跑9次(m=1~9)，然後換行...
			 */
		}
	}

	@Test // while迴圈 等差屬列
	public void WhileQ1() {
		System.out.println(this.rewq(1, 100));
	}

	public int rewq(int start, int end) {
		int sum = 0;
		while (start <= end) {
			sum += start;
			start++;
		}
		return sum;
	}

	@Test // 巢狀while 印出九九乘法表
	public void while99() {
		int n = 1;
		while (n <= 9) {
			int m = 1;
			while (m <= 9) {
				System.out.printf("%d*%d=%2d  ", n, m, n * m);
				m++;
			}
			System.out.println();
			n++;
		}
	}

	// do while迴圈：先執行程式主體，在判斷是否符合判斷條件 do{//欲重複執行的程式主體}while(判斷條件) 

	@Test // do while等差
	public void dowhileTest() {
		System.out.println(this.poiuyt(1, 100));
	}

	public int poiuyt(int start, int end) {
		int sum = 0;
		do {sum += start;
			start++;
		} while (start <= end);
		return sum;
	}
	
	//無窮迴圈 while(true){}、for(;;){} 使用時機：不確定何時會停止
	//break直接中斷迴圈，跳到迴圈外面；continue跳過這一回，下一輪仍會執行；return直接中斷方法
	@Test
	public void breakconti() {
		int i=-1;
		while(true) {
			i++;
			if(i==1) {
				continue;
			}
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
	}
	
	@Test //巢狀迴圈，break&continue會自動對離最近的迴圈(內層)作用，若要對外層作用，需要幫外層迴圈加上一個標籤，註明要跳過哪個迴圈
	public void nestedLoopBreakTest() {
		a:for(int i=0;i<10;i+=2) { //幫外層取名字a
			System.out.println(i);
			for(int j=1;j<10;j+=2) {
				System.out.println(j);
				break a; //註明結束(外層)a迴圈，所以整個方法就結束了；只打break;回結束最近的迴圈(內層)
			}
			System.out.println("內層已結束");
		}
		System.out.println("外層已結束");
	}

	@Test // 雞兔同籠
	public void rabbitTest() {
		this.rabbitch(15,68);
	}
	
	public void rabbitch(int head, int foot) {
		if (foot%2!=0) {System.out.println("無解"); //如果腳是偶數，直接回傳無解
		return;}
		int rabbit = head;
		while (rabbit * 4 + (head - rabbit) * 2 != foot) {
			rabbit--;
			if(rabbit<=0) { //無解要寫在break裡面，迴圈才不會無限下去
			System.out.println("無解");
			break;} //break是給迴圈用的
		}
		if (rabbit >0) {
			System.out.println("兔子有" + rabbit + "隻\n雞有" + (head - rabbit)+ "隻");//換行的寫法
		} 
	}
	
	

	
	
	

}
