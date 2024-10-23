package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexTest {
	@Test
	public void test() {
		String str = "ABCDABCDA";
		String str1 = str.replace("A", "Z");
		// replaceAll才可以放用正規表達式寫法的字串
		// []是只要出現該範圍內，A-C:A到C==A到C的範圍(A.B.C)全部換成Z
		String str2 = str.replaceAll("[A-C]", "Z");
		System.out.println(str2);
	}
	
	@Test
	public void test1() {		
		// \ 在java中表示跳脫符號，用來跳脫有特殊意義的符號-->讓有特殊意義的符號變成單純的字串
		// \ 跳脫符號無法單純存在
		System.out.println("\\");// 印出後面那一條 \
		//第一個跳脫符號是讓第二個跳脫符號從有特殊意義變成字串
		
		//比對手機號碼格式：數字4碼-數字3碼-數字3碼
		// \d 表示數字0到9的其中一個；
		String pattern="\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		
		Scanner s=new Scanner(System.in);
		System.out.println("請輸入手機號碼(格式：數字4碼-數字3碼-數字3碼)");
		String input=s.nextLine();
		boolean check=input.matches(pattern);
		if(check) {
			System.out.println(input+"符合手機號碼格式");
		}else {
			System.out.println(input+"不符合手機號碼格式");
		}
		//上面的check只用了一次，可以用匿名(不用變數名稱來接結果)的方式改寫
		if(input.matches(pattern)) {
			System.out.println(input+"符合手機號碼格式");
		}else {
			System.out.println(input+"不符合手機號碼格式");
		}
	}
	@Test
	public void test2() {		
		//使用大括號{}處裡pattern中重複出現的字串
		String pattern="\\d{4}-\\d{3}-\\d{3}";	
		//又等同於
		pattern="\\d{4}(-\\d{3}){2}";
		
		Scanner s=new Scanner(System.in);
		System.out.println("請輸入手機號碼(格式：數字4碼-數字3碼-數字3碼)");
		String input=s.nextLine();
		if(input.matches(pattern)) {
			System.out.println(input+"符合手機號碼格式");
		}else {
			System.out.println(input+"不符合手機號碼格式");
		}
	}
	
	@Test//管道|
	public void test3() {
		//市話格式有兩種(數字2碼)-數字7碼 或是 數字2碼-數字7碼
		String pattern1="\\d{2}-\\d{7}";
		String pattern2="\\(\\d{2}\\)-\\d{7}";
		//可以用管道|代替，相當於java中的OR
		String pattern3="\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
		//也可以寫成
		pattern3="(\\d{2}|\\(\\d{2}\\))-\\d{7}";
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
	}
	
	@Test //大括號代表數字區間 
	public void test4() {
		//市話格式：數字2碼-數字7碼或8碼
		// \\d{7,8}代表\\d最少出現7次，最多8次
		String pattern="\\d{2}-\\d{7,8}";
	}
	
	@Test 
	public void practice1() {
		//市話格式：數字2碼-數字7碼或8碼 或是 (數字2碼)數字7碼或8碼
		String pattern="(\\(\\d{2}\\)|\\d{2}-)\\d{7,8}";
		Scanner s=new Scanner(System.in);
		System.out.println("請輸入市話號碼");
		String input=s.nextLine();
		if(input.matches(pattern)) {
			System.out.println("符合格式");
		}else {
			System.out.println("不符合格式");
		}
	}
	
	@Test 
	public void practice2() {
		//市話格式：數字2到4碼(以0開頭)-數字7碼或8碼
		String pattern="0\\d{1,3}-\\d{7,8}";
		Scanner s=new Scanner(System.in);
		System.out.println("請輸入市話號碼");
		String input=s.nextLine();
		if(input.matches(pattern)) {
			System.out.println("符合格式");
		}else {
			System.out.println("不符合格式");
		}
	}
	
	@Test //ASCIII
	public void asciiiTest() {
		char a=65; //A
		char b=97; //a
		System.out.println(a+""+b);
	}
	
	@Test
	public void test5() {
		String pattern = "[A-CW-Z]"; //符合的字有A到C及W到Z
		String str="ACC";
		System.out.println(str.matches(pattern)); //false
		pattern = "[A-CW-Z]{3}";
		System.out.println(str.matches(pattern)); //true
	}
	
	@Test
	public void test6() {
		//電話格式：區碼2-4碼(第一個數字不能為0)-電話號碼7-8碼)
		String pattern = "0[1-9]{1,3}-\\d{7,8}";
		//[1-9]==[\\d&&[^0]]
		Scanner s=new Scanner(System.in);
		System.out.println("請輸入電話號碼");
		String input=s.nextLine();
		System.out.println(input.matches(pattern));
	}
	
	@Test
	public void test7() {
		//身份證字號檢查
		String pattern = "[A-Za-z][12]\\d{8}";
		Scanner s=new Scanner(System.in);
		System.out.println("請輸入身份證字號");
		String input=s.nextLine();
		//不用正規表達式
//		if(input.length()!=10) {
//			System.out.println("false");
//		}
		//再排除6都的大小寫英文字母(A、B、D、E、F、H)
		System.out.println(input.matches(pattern));
		pattern = "[A-Za-z&&[^ABDEFHabdefh]][12]\\d{8}";
		System.out.println(input.matches(pattern));
		// \\w代表數字、字母、_(底線)
		pattern = "[\\w&&[^ABDEFHabdefh0-9_]][12]\\d{8}";
		System.out.println(input.matches(pattern));
	}
	
	

}
