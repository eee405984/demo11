package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class lesson1014 {
	@Test
	public void contextLoads() {
		int aaa; // �w�]�Ȭ�0
		Integer bbb; // �w�]�Ȭ�null�G�]��Integer�O���O(class)
	}

	@Test
	public void stringBufferTest() {
		StringBuffer strBuf = new StringBuffer("abc");
		strBuf.append("ABC"); // stringBuffer���걵�Gappend
		strBuf.append("DEF").append("GHI"); // stringBuffer�i�H�@���걵�U�h
		System.out.println(strBuf);
		System.out.println(strBuf.toString());
		strBuf.delete(2, 4); // �R���϶��̪��r(�����]�t)
		// �r�����G.reverse()
		String str1 = "12345";
		StringBuffer strBuf1 = new StringBuffer(str1);
		String str2 = strBuf1.reverse().toString();
		// ����StringBuffer���ܡA�p�����r��?
		String[] arr1 = str1.split("");
		String str3 = ""; // �O�o�n�����(�Ŧr��)
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
			System.out.println("�O�^��");
		}else {
			System.out.println("���O�^��");
		}
		}

}
