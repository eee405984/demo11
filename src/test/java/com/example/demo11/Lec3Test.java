package com.example.demo11;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec3Test {
	@Test // ���j�G�ƾǤW���G��{��S(n)=1~n���M�F�hS(100)=100+S(99)=100+99+S(98)=100+99...+S(1)
	// �ҥH��{���i�H���̤p���OS(1)�A�ҥH�����DS(1)����
	// S(n)=n+S(n-1)
	// �򥻤W���j���o�쪺�A�j��]�వ��A�ҥH���ίS�O�j�j�g
	public void recurrenceTest() {
		System.out.println(this.recurrence(100));
	}

	public int recurrence(int x) {
		if (x == 1) {
			return 1;
		}
		int sum = x + this.recurrence(x - 1);// �{���u�n�b�{���̭����I�s�ۤv�N�|�O���j
		return sum;
	}

//if else ����ĳ�ζW�L3�ӱ��p
	@Test // �����p��
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

	@Test // �ǥͦ��Z�ŶZ
	public void gradeTest() {
		System.out.println(this.studentgrade(89));
	}

	public String studentgrade(int grade) {
		String g;
		switch (grade / 10) { // switch������
		case 10: // catch���ؿ��A���@�˪���Ʒ|���쨺���~��A�ҥH:�᭱���Υ��]�S��
		case 9: // switch�`�Φb�Ʊ�{�����}�l�M�����i�H�ۤv����ɭ�
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

	@Test // �t�β����H���Ʀr�GMath.random()�G�w�]�H������ �j��0 �p��1 ��double FP
	// Math.random()*(�϶��j�p)+�U���� �G�]�N�O�q�U���ȩ��W�@���X�Ӽ�
	// random�y�k�i�H����google�d

	public void lotteryTest() {// �H�����ͤ@�դj�ֳz���X(�@��6�X)P 10-4
		int[] ball = new int[50];// �}�Cint[] �}�C�W��=new int[�}�C����];
		for (int n = 1; n <= 49; n++) {
			ball[n] = n;
		}
		int t = 1;
		while (t <= 6) {// �@�զ�6�X
			int number = (int) (Math.random() * (49) + 1); // ��int�GMath.random()*(49)�N�O0.�h�A�ҥH�n��1�@�_��ӬA�_��
			if (ball[number] == 0) { // ���w�Q��J0���N���L�o�@��
				continue;
			} else {
				System.out.printf("%2d ", number);
				ball[number] = 0; // ��w�g�Q��X�Ӫ��Ʀr�}�C��m���J0
				t++;
			}
		}
	}

	@Test // �t�β����H���Ʀr�GRandom.nextInt(int n)�G�j�󵥩�0�A�p��n[0,n)
	// Random.nextInt(int num1,int num2)�G�j�󵥩�num1�A�p��num2�A�Y[num1,num2)
	public void randomNumberTest() {
		int[] numbers = new int[6];
		for (int n = 0; n < 6; n++) {
			Random r = new Random(); // �@�˭nimport��ŧi(�]��Random���O���ت����O)
			numbers[n] = r.nextInt(1, 49);
			System.out.printf("%2d ", numbers[n]);
		}
	}

	@Test
	public void ScanChTest() {
		Scanner s = new Scanner(System.in);
		String str2 = s.nextLine();// �p��Jasd
		char ch = str2.charAt(2); // ���޿�J���r�ꪺ��()�Ӧr���F()�q0�}�l��
		System.out.println(ch);// charAt(2)�Od
	}

	/*
	 * @Test // �q�Ʀr1 public void guessNumber() { int ans = (int) (Math.random() *
	 * (97) + 2); Scanner s = new Scanner(System.in);
	 * System.out.println("�п�J1~99�䤤�@�Ʀr"); while (true) { int guess = s.nextInt();
	 * if (guess <= 1) { System.out.println("�п�J�j��1���Ʀr"); } else if (guess >= 99) {
	 * System.out.println("�п�J�p��99���Ʀr"); } else if (guess < ans) {
	 * System.out.println("�Цb" + guess + "~99���q�ӼƦr"); } else if (guess > ans) {
	 * System.out.println("�Цb1~" + guess + "���q�ӼƦr"); } else {
	 * System.out.println("���߲q��"); break; }
	 * 
	 * } }
	 */

	@Test // �q�Ʀr2
	public void guessnumber22() {
		int ans = (int) (Math.random() * (97) + 2);
		int upper = 99;
		int lower = 1; // ���]�W����U�����ܼơA�~���ۿ�J���Ʀr��ʤW�U��
		try (Scanner s = new Scanner(System.in)) {
			// try...catch �Φb�i��X�������p�Atry(�i��X�������O)�F�����O�W�ٮذ_�ӤU���|���ֱ����A��
			System.out.println("�п�J1~99�䤤�@�Ʀr");
			while (true) {
				int guess = s.nextInt();
				if (guess <= lower || guess >= upper) {
					System.out.println("��J�Ʀr���b�d�򤺡A�п�J" + lower + "~" + upper + "�����Ʀr");
				} else if (guess < ans) {
					System.out.println("�Цb" + guess + "~" + upper + "���q�ӼƦr");
					lower = guess;
				} else if (guess > ans) {
					System.out.println("�Цb" + lower + "~" + guess + "���q�ӼƦr");
					upper = guess;
				} else {
					System.out.println("���߲q��");
					break;
				}
			}
		} catch (InputMismatchException ex) { // catch(�i��o�ͪ�Exception�άOError) ���~�W�١F���L�]���@���A���U����JUnit�|�����~���W�r�i�H�ƻs�_��
			// Ctrl+shift+O�G�۰�import
			System.out.println("��J�D��ơA�C������");
		}
	}

	@Test // �T�w�O�_�ŦX�榡�F\\d{4}���|�ӼƦr�A�ܼƦW��.matches(pattern)�G�|�Oboolean�A�O�_�ŦX�榡
	public void PatternTest() {
		String str1 = "pardon panda";
		String str2 = "0989-764-329";
		String str3 = "1111-1234567";
		String pattern23 = "\\d{4}-\\d{3}-\\d{3}";
		System.out.println(str1.matches(pattern23));
		System.out.println(str2.matches(pattern23));
		System.out.println(str3.matches(pattern23));
	}

	@Test // �q�Ʀr�C��AB
	public void numberABTest() {
		// �קK���ץX���ƪ��Ʀr
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
				ans[t] = ("" + ru[number]).charAt(0); // (""+int���)=��int��String
				ru[number] = 665;
				t++;
			}
		}
		System.out.println(ans); // �u���r�����}�C�O�����x�s�A�ҥH�i�H�����L

		A: while (true) {
			System.out.println("�вq�|�ӼƦr");
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			char[] guess = new char[4];
			for (int q = 0; q < 4; q++) {
				char ch = str.charAt(q);
				guess[q] = ch; // �q��J���r�ꤤ���ަ�m���r���]�O�o�A�q0�}�l�^
			}
			
			// ���b�G��J�D�|�ӼƦr
			String pattern1 = "\\d{4}";
			if (str.matches(pattern1) == false) {
				System.out.println("��J�����O�|�ӼƦr");
				continue A;
			}
			
			// ���b�G�q���Ʀr������
			for(int u=0;u<4;u++) {
			if(str.indexOf(guess[u])!=str.lastIndexOf(guess[u])) {
				System.out.println("�Ʀr������");
				continue A;
			}
				}
//			for (int u = 0; u <= 2; u++) {
//				for (int y = u + 1; y <= 3; y++) {
//					if (guess[u] == guess[y]) {
//						System.out.println("�Ʀr������");
//						continue A;
//					}
//				}
//			}

			//�P�_�XA�XB
			int A = 0;
			int B = 0;
			for (int m = 0; m <= 3; m++) {
				if (ans[m] == guess[m]) {
					A++;
					continue;
				}
				for (int n = 0; n <= 3; n++) {
//					if(m==n) {break;} //���i�H�g�o�ӡA���Mm==n�᭱�A�N���|�]���S��B++�F
					if (ans[n] == guess[m]) {
						B++;
					}
				}
			}
			if (A == 4) {
				System.out.println("���߲q��!!");
				break;
			}
			System.out.println(A + "A" + B + "B");
		}

	}

}
