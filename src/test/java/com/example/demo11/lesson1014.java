package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class lesson1014 {
	@Test
	public void contextLoads() {
		int aaa; // 預設值為0
		Integer bbb; // 預設值為null：因為Integer是類別(class)
	}

	@Test
	public void stringBufferTest() {
		StringBuffer strBuf = new StringBuffer("abc");
		strBuf.append("ABC"); // stringBuffer的串接：append
		strBuf.append("DEF").append("GHI"); // stringBuffer可以一直串接下去
		System.out.println(strBuf);
		System.out.println(strBuf.toString());
		strBuf.delete(2, 4); // 刪掉區間裡的字(尾不包含)
		// 字串反轉：.reverse()
		String str1 = "12345";
		StringBuffer strBuf1 = new StringBuffer(str1);
		String str2 = strBuf1.reverse().toString();
		// 不用StringBuffer的話，如何反轉字串?
		String[] arr1 = str1.split("");
		String str3 = ""; // 記得要先放值(空字串)
		for (int n = arr1.length - 1; n >= 0; n--) {
			str3 = str3 + arr1[n];
		}
	}
	
	@Test
	public void ajdio() {
		Scanner s=new Scanner(System.in);
		String line=s.nextLine();	
		StringBuffer strBu=new StringBuffer(line);
		if(strBu==strBu.reverse()) {
			System.out.println("是回文");
		}else {
			System.out.println("不是回文");
		}
		}

}
