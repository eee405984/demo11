package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexTest {
	@Test
	public void test() {
		String str = "ABCDABCDA";
		String str1 = str.replace("A", "Z");
		// replaceAll�~�i�H��Υ��W��F���g�k���r��
		// []�O�u�n�X�{�ӽd�򤺡AA-C:A��C==A��C���d��(A.B.C)��������Z
		String str2 = str.replaceAll("[A-C]", "Z");
		System.out.println(str2);
	}
	
	@Test
	public void test1() {		
		// \ �bjava����ܸ���Ÿ��A�ΨӸ��榳�S��N�q���Ÿ�-->�����S��N�q���Ÿ��ܦ���ª��r��
		// \ ����Ÿ��L�k��¦s�b
		System.out.println("\\");// �L�X�᭱���@�� \
		//�Ĥ@�Ӹ���Ÿ��O���ĤG�Ӹ���Ÿ��q���S��N�q�ܦ��r��
		
		//��������X�榡�G�Ʀr4�X-�Ʀr3�X-�Ʀr3�X
		// \d ��ܼƦr0��9���䤤�@�ӡF
		String pattern="\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		
		Scanner s=new Scanner(System.in);
		System.out.println("�п�J������X(�榡�G�Ʀr4�X-�Ʀr3�X-�Ʀr3�X)");
		String input=s.nextLine();
		boolean check=input.matches(pattern);
		if(check) {
			System.out.println(input+"�ŦX������X�榡");
		}else {
			System.out.println(input+"���ŦX������X�榡");
		}
		//�W����check�u�ΤF�@���A�i�H�ΰΦW(�����ܼƦW�٨ӱ����G)���覡��g
		if(input.matches(pattern)) {
			System.out.println(input+"�ŦX������X�榡");
		}else {
			System.out.println(input+"���ŦX������X�榡");
		}
	}
	@Test
	public void test2() {		
		//�ϥΤj�A��{}�B��pattern�����ƥX�{���r��
		String pattern="\\d{4}-\\d{3}-\\d{3}";	
		//�S���P��
		pattern="\\d{4}(-\\d{3}){2}";
		
		Scanner s=new Scanner(System.in);
		System.out.println("�п�J������X(�榡�G�Ʀr4�X-�Ʀr3�X-�Ʀr3�X)");
		String input=s.nextLine();
		if(input.matches(pattern)) {
			System.out.println(input+"�ŦX������X�榡");
		}else {
			System.out.println(input+"���ŦX������X�榡");
		}
	}
	
	@Test//�޹D|
	public void test3() {
		//���ܮ榡�����(�Ʀr2�X)-�Ʀr7�X �άO �Ʀr2�X-�Ʀr7�X
		String pattern1="\\d{2}-\\d{7}";
		String pattern2="\\(\\d{2}\\)-\\d{7}";
		//�i�H�κ޹D|�N���A�۷��java����OR
		String pattern3="\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
		//�]�i�H�g��
		pattern3="(\\d{2}|\\(\\d{2}\\))-\\d{7}";
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
	}
	
	@Test //�j�A���N��Ʀr�϶� 
	public void test4() {
		//���ܮ榡�G�Ʀr2�X-�Ʀr7�X��8�X
		// \\d{7,8}�N��\\d�̤֥X�{7���A�̦h8��
		String pattern="\\d{2}-\\d{7,8}";
	}
	
	@Test 
	public void practice1() {
		//���ܮ榡�G�Ʀr2�X-�Ʀr7�X��8�X �άO (�Ʀr2�X)�Ʀr7�X��8�X
		String pattern="(\\(\\d{2}\\)|\\d{2}-)\\d{7,8}";
		Scanner s=new Scanner(System.in);
		System.out.println("�п�J���ܸ��X");
		String input=s.nextLine();
		if(input.matches(pattern)) {
			System.out.println("�ŦX�榡");
		}else {
			System.out.println("���ŦX�榡");
		}
	}
	
	@Test 
	public void practice2() {
		//���ܮ榡�G�Ʀr2��4�X(�H0�}�Y)-�Ʀr7�X��8�X
		String pattern="0\\d{1,3}-\\d{7,8}";
		Scanner s=new Scanner(System.in);
		System.out.println("�п�J���ܸ��X");
		String input=s.nextLine();
		if(input.matches(pattern)) {
			System.out.println("�ŦX�榡");
		}else {
			System.out.println("���ŦX�榡");
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
		String pattern = "[A-CW-Z]"; //�ŦX���r��A��C��W��Z
		String str="ACC";
		System.out.println(str.matches(pattern)); //false
		pattern = "[A-CW-Z]{3}";
		System.out.println(str.matches(pattern)); //true
	}
	
	@Test
	public void test6() {
		//�q�ܮ榡�G�ϽX2-4�X(�Ĥ@�ӼƦr���ର0)-�q�ܸ��X7-8�X)
		String pattern = "0[1-9]{1,3}-\\d{7,8}";
		//[1-9]==[\\d&&[^0]]
		Scanner s=new Scanner(System.in);
		System.out.println("�п�J�q�ܸ��X");
		String input=s.nextLine();
		System.out.println(input.matches(pattern));
	}
	
	@Test
	public void test7() {
		//�����Ҧr���ˬd
		String pattern = "[A-Za-z][12]\\d{8}";
		Scanner s=new Scanner(System.in);
		System.out.println("�п�J�����Ҧr��");
		String input=s.nextLine();
		//���Υ��W��F��
//		if(input.length()!=10) {
//			System.out.println("false");
//		}
		//�A�ư�6�����j�p�g�^��r��(A�BB�BD�BE�BF�BH)
		System.out.println(input.matches(pattern));
		pattern = "[A-Za-z&&[^ABDEFHabdefh]][12]\\d{8}";
		System.out.println(input.matches(pattern));
		// \\w�N��Ʀr�B�r���B_(���u)
		pattern = "[\\w&&[^ABDEFHabdefh0-9_]][12]\\d{8}";
		System.out.println(input.matches(pattern));
	}
	
	

}
