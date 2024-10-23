package com.example.demo11;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec3Test {
	@Test // 遞迴：數學上長：方程式S(n)=1~n的和；則S(100)=100+S(99)=100+99+S(98)=100+99...+S(1)
	// 所以方程式可以拆到最小的是S(1)，所以必須求S(1)的解
	// S(n)=n+S(n-1)
	// 基本上遞迴做得到的，迴圈也能做到，所以不用特別勉強寫
	public void recurrenceTest() {
		System.out.println(this.recurrence(100));
	}

	public int recurrence(int x) {
		if (x == 1) {
			return 1;
		}
		int sum = x + this.recurrence(x - 1);// 程式只要在程式裡面有呼叫自己就會是遞迴
		return sum;
	}

//if else 不建議用超過3個情況
	@Test // 票價計算
	public void ticketTest() {
		System.out.println(this.much(12));
	}

	public int much(int old) {
		if (old <= 6 || old >= 80) {
			return (int) (100 * 0.2);
		} else if (12 < old && old < 60) {
			return 100;
		} else {
			return (int) (100 * 0.5);
		}
	}

	@Test // 學生成績級距
	public void gradeTest() {
		System.out.println(this.studentgrade(89));
	}

	public String studentgrade(int grade) {
		String g;
		switch (grade / 10) { // switch比對條件
		case 10: // catch像目錄，抓到一樣的資料會跳到那邊繼續，所以:後面不用打也沒關
		case 9: // switch常用在希望程式的開始和結束可以自己控制的時候
			g = "A";
			break;
		case 8:
			g = "B";
			break;
		case 7:
			g = "C";
			break;
		case 6:
			g = "D";
			break;
		default:
			g = "F";
		}
		return g;
	}

	@Test // 系統產生隨機數字：Math.random()：預設隨機產生 大於0 小於1 的double FP
	// Math.random()*(區間大小)+下限值 ：也就是從下限值往上共有幾個數
	// random語法可以直接google查

	public void lotteryTest() {// 隨機產生一組大樂透號碼(一組6碼)P 10-4
		int[] ball = new int[50];// 陣列int[] 陣列名稱=new int[陣列長度];
		for (int n = 1; n <= 49; n++) {
			ball[n] = n;
		}
		int t = 1;
		while (t <= 6) {// 一組有6碼
			int number = (int) (Math.random() * (49) + 1); // 變int：Math.random()*(49)就是0.多，所以要跟1一起整個括起來
			if (ball[number] == 0) { // 抽到已被放入0的就跳過這一輪
				continue;
			} else {
				System.out.printf("%2d ", number);
				ball[number] = 0; // 把已經被抽出來的數字陣列位置改放入0
				t++;
			}
		}
	}

	@Test // 系統產生隨機數字：Random.nextInt(int n)：大於等於0，小於n[0,n)
	// Random.nextInt(int num1,int num2)：大於等於num1，小於num2，即[num1,num2)
	public void randomNumberTest() {
		int[] numbers = new int[6];
		for (int n = 0; n < 6; n++) {
			Random r = new Random(); // 一樣要import跟宣告(因為Random不是內建的類別)
			numbers[n] = r.nextInt(1, 49);
			System.out.printf("%2d ", numbers[n]);
		}
	}

	@Test
	public void ScanChTest() {
		Scanner s = new Scanner(System.in);
		String str2 = s.nextLine();// 如輸入asd
		char ch = str2.charAt(2); // 索引輸入的字串的第()個字元；()從0開始算
		System.out.println(ch);// charAt(2)是d
	}

	/*
	 * @Test // 猜數字1 public void guessNumber() { int ans = (int) (Math.random() *
	 * (97) + 2); Scanner s = new Scanner(System.in);
	 * System.out.println("請輸入1~99其中一數字"); while (true) { int guess = s.nextInt();
	 * if (guess <= 1) { System.out.println("請輸入大於1的數字"); } else if (guess >= 99) {
	 * System.out.println("請輸入小於99的數字"); } else if (guess < ans) {
	 * System.out.println("請在" + guess + "~99內猜個數字"); } else if (guess > ans) {
	 * System.out.println("請在1~" + guess + "內猜個數字"); } else {
	 * System.out.println("恭喜猜對"); break; }
	 * 
	 * } }
	 */

	@Test // 猜數字2
	public void guessnumber22() {
		int ans = (int) (Math.random() * (97) + 2);
		int upper = 99;
		int lower = 1; // 先設上限跟下限的變數，才能跟著輸入的數字更動上下限
		try (Scanner s = new Scanner(System.in)) {
			// try...catch 用在可能出錯的情況，try(可能出錯的類別)；把類別名稱框起來下面會有快捷幫你打
			System.out.println("請輸入1~99其中一數字");
			while (true) {
				int guess = s.nextInt();
				if (guess <= lower || guess >= upper) {
					System.out.println("輸入數字不在範圍內，請輸入" + lower + "~" + upper + "內之數字");
				} else if (guess < ans) {
					System.out.println("請在" + guess + "~" + upper + "內猜個數字");
					lower = guess;
				} else if (guess > ans) {
					System.out.println("請在" + lower + "~" + guess + "內猜個數字");
					upper = guess;
				} else {
					System.out.println("恭喜猜對");
					break;
				}
			}
		} catch (InputMismatchException ex) { // catch(可能發生的Exception或是Error) 錯誤名稱；讓他跑錯一次，按下面的JUnit會有錯誤的名字可以複製起來
			// Ctrl+shift+O：自動import
			System.out.println("輸入非整數，遊戲結束");
		}
	}

	@Test // 確定是否符合格式；\\d{4}指四個數字，變數名稱.matches(pattern)：會是boolean，是否符合格式
	public void PatternTest() {
		String str1 = "pardon panda";
		String str2 = "0989-764-329";
		String str3 = "1111-1234567";
		String pattern23 = "\\d{4}-\\d{3}-\\d{3}";
		System.out.println(str1.matches(pattern23));
		System.out.println(str2.matches(pattern23));
		System.out.println(str3.matches(pattern23));
	}

	@Test // 猜數字遊戲AB
	public void numberABTest() {
		// 避免答案出重複的數字
		int[] ru = new int[10];
		char[] ans = new char[4];
		for (int n = 0; n <= 9; n++) {
			ru[n] = n;
		}
		int t = 0;
		while (t <= 3) {
			int number = (int) (Math.random() * (10) + 0);
			if (ru[number] == 665) {
				continue;
			} else {
				ans[t] = ("" + ru[number]).charAt(0); // (""+int資料)=把int變String
				ru[number] = 665;
				t++;
			}
		}
		System.out.println(ans); // 只有字元的陣列是直接儲存，所以可以直接印

		A: while (true) {
			System.out.println("請猜四個數字");
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			char[] guess = new char[4];
			for (int q = 0; q < 4; q++) {
				char ch = str.charAt(q);
				guess[q] = ch; // 從輸入的字串中索引位置的字元（記得，從0開始）
			}
			
			// 防呆：輸入非四個數字
			String pattern1 = "\\d{4}";
			if (str.matches(pattern1) == false) {
				System.out.println("輸入的不是四個數字");
				continue A;
			}
			
			// 防呆：猜的數字有重複
			for(int u=0;u<4;u++) {
			if(str.indexOf(guess[u])!=str.lastIndexOf(guess[u])) {
				System.out.println("數字有重複");
				continue A;
			}
				}
//			for (int u = 0; u <= 2; u++) {
//				for (int y = u + 1; y <= 3; y++) {
//					if (guess[u] == guess[y]) {
//						System.out.println("數字有重複");
//						continue A;
//					}
//				}
//			}

			//判斷幾A幾B
			int A = 0;
			int B = 0;
			for (int m = 0; m <= 3; m++) {
				if (ans[m] == guess[m]) {
					A++;
					continue;
				}
				for (int n = 0; n <= 3; n++) {
//					if(m==n) {break;} //不可以寫這個，不然m==n後面，就不會跑有沒有B++了
					if (ans[n] == guess[m]) {
						B++;
					}
				}
			}
			if (A == 4) {
				System.out.println("恭喜猜對!!");
				break;
			}
			System.out.println(A + "A" + B + "B");
		}

	}

}
