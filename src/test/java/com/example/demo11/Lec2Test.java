package com.example.demo11;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Lec2Test {
	@Test // �Ʋ�
	public void reviewLec1() {
		int a;
		String b = "1111";
	}

	public void commentTest() {
		// ������
		/*
		 * �h�����
		 */
		System.out.println(this.e(0));
	}

	/**
	 * ������
	 * 
	 * @param y �@��g�ѼƬO����(�ǥX�h����)
	 * @return �@��g�^�Ǫ��� �����ѡG�b�I�s��k���ɭԡA�i�H�ݨ�(���в���I�s����k�W�٤W��)
	 */
	public String e(int y) {
		return null;
	}

	// �T���B��G �P�_��? ��1:��2 (�p�G�P�_���Otrue�^�ǭ�1�A�p�Gfalse�^�ǭ�2)

	@Test // �e�m�B��B��m�B��
	public void comdTest() {
		int a = 10;
		System.out.println(a++ * 10); // ��a*10�A�Aa=a+1
		System.out.println(a);
		a = 10;
		System.out.println(++a * 10);// ��a=a+1�A�Aa*10
		System.out.println(a); // a���٬O=a+1
	}

	@Test // �D�l�ƹB��l%
	public void modTest() {
		int tt = 10 % 3; // 10���H3�l1
		System.out.println(tt);
	}

	// �ƦX���w�B��l a+=b (a=a+b) �⭫�ƪ�a�ٲ��A�B��Ÿ�����=�e��

	@Test // �D�ءGa=a+9�Fa=a-1�Fa=5*a�Fa=b/5�Fa=a%b�Fa=b%a
	public void riuns() {
		int a = 1;
		int b = 10;
		System.out.println(a += 9);
		System.out.println(a--); // �La--�|���L�Xa�A�Aa=a-1�F�L--a�ۤ�
		System.out.println(a *= 5);
		System.out.println(a = b / 5);
		System.out.println(a %= b);
		System.out.println(a = b % a);
	}

	@Test // �ϦV�B��!(�ۤ�)�F�B&&(and�A�����u)�F��||(or�A��@���u)�F����^(xor�A��̬۲�)(�b�Ʀr6)
	public void fhuewi() {
		boolean s = true;
		System.out.println(!s);
		System.out.println(1 == 1 || 1 != 1);
		System.out.println(1 == 1 && 1 != 1);
	}

	// �A���B��l>�@���B��l>���W����B��l>��N�B��l(��������[��)>����B��l>�޿�B��l>���w�B��l(=)

	@Test // ���t�ƦC�M
	public void hfsiu() {
		System.out.println(this.sum(1, 100));
	}

	/**
	 * @param start �_�l��
	 * @param end   �̲׭�
	 * @return �ƦC�`�M
	 */
	public int sum(int start, int end) {
		return (start + end) * (end - start + 1) / 2; // �ΦW�ܼ�
	}
	// �Y�ơG���eshift+tab�B����tab

	@Test // �ū��ഫ
	public void tem() {
		System.out.println(this.Ctem(28.3));
		System.out.println(this.Ftem(89));
	}

	/**
	 * @param a ���ū�
	 * @return �ഫ�᪺�ؤ�ū�
	 */
	public double Ctem(double a) {
		return a * 9 / 5 + 32;
	}

	/**
	 * @param t �ؤ�ū�
	 * @return �ഫ�᪺���ū�
	 */
	public double Ftem(double t) {
		return (t - 32) * 5 / 9;
	}

	// for�j��Gfor(��l��;�P�_����;���N�B��) { // �����ư��檺�{���D�� }

	@Test // for�j�骺���t�ƦC�M
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

	// �_��for�j��(for�̭��S�]�A�ܤ֤@��for)�Gfor(��l��;�P�_����;���N�B��){for(��l��;�P�_����;���N�B��){// �{���D�� }}
	// ����Ÿ��G%d(���) %s(�r��) �����᭱����Ʀ��n�n�������(��b%��d����)�A���������
	// printf�G�����H�r��}�Y�B���|�۰ʴ���(�Y�n����A�ݥ[�W \n )�A�B�ߤ@��ϥΦ���Ÿ�
	@Test // �_��for�j�� �L�E�E���k��
	public void forforTest() {
		for (int n = 1; n <= 9; n++) {// for�j��1��
			for (int m = 1; m <= 9; m++) { // for�j��2��
				System.out.printf("%d*%d=%2d  ", m, n, m * n);
			}
			System.out.printf("\n"); // =����=System.out.println();
			/*
			 * 1��for�j��}�l�]�Ĥ@��(n=1)�A2���]9���im=1�A�L�Xn*m=(��printf������)�Fm=2�A�L�Xn*m=...��m=9�j�A�M�ᴫ��
			 * �M��1���}�l�ĤG��(n=2)�A2���]9��(m=1~9)�A�M�ᴫ��...
			 */
		}
	}

	@Test // while�j�� ���t�ݦC
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

	@Test // �_��while �L�X�E�E���k��
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

	// do while�j��G������{���D��A�b�P�_�O�_�ŦX�P�_���� do{//�����ư��檺�{���D��}while(�P�_����) 

	@Test // do while���t
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
	
	//�L�a�j�� while(true){}�Bfor(;;){} �ϥήɾ��G���T�w��ɷ|����
	//break�������_�j��A����j��~���Fcontinue���L�o�@�^�A�U�@�����|����Freturn�������_��k
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
	
	@Test //�_���j��Abreak&continue�|�۰ʹ����̪񪺰j��(���h)�@�ΡA�Y�n��~�h�@�ΡA�ݭn���~�h�j��[�W�@�Ӽ��ҡA�����n���L���Ӱj��
	public void nestedLoopBreakTest() {
		a:for(int i=0;i<10;i+=2) { //���~�h���W�ra
			System.out.println(i);
			for(int j=1;j<10;j+=2) {
				System.out.println(j);
				break a; //��������(�~�h)a�j��A�ҥH��Ӥ�k�N�����F�F�u��break;�^�����̪񪺰j��(���h)
			}
			System.out.println("���h�w����");
		}
		System.out.println("�~�h�w����");
	}

	@Test // ���ߦPŢ
	public void rabbitTest() {
		this.rabbitch(15,68);
	}
	
	public void rabbitch(int head, int foot) {
		if (foot%2!=0) {System.out.println("�L��"); //�p�G�}�O���ơA�����^�ǵL��
		return;}
		int rabbit = head;
		while (rabbit * 4 + (head - rabbit) * 2 != foot) {
			rabbit--;
			if(rabbit<=0) { //�L�ѭn�g�bbreak�̭��A�j��~���|�L���U�h
			System.out.println("�L��");
			break;} //break�O���j��Ϊ�
		}
		if (rabbit >0) {
			System.out.println("�ߤl��" + rabbit + "��\n����" + (head - rabbit)+ "��");//���檺�g�k
		} 
	}
	
	

	
	
	

}
