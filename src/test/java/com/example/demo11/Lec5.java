package com.example.demo11;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class Lec5 {
	@Test
	public void mathTest() {
		int a = Math.max(1, 2); // max�����ӭȭ��Ӥ���j�A�^�Ǥ���j���Fmin�ۤ�
		System.out.println(a);
		int b = Math.min(2, Math.min(3, 98)); // ����T�ӭȮ�
		int c = Math.abs(-23); // abs�������(�t���ܥ���)
		int d = (int) Math.round(3.45); // �|�ˤ��J�A���A�Olong
		int e1 = (int) Math.rint(3.5);// rint�G�|�ˤ��J�A=�ӷ�p���I�O5�ɡA�^�ǳ̱��񪺰��ƭ�(�p3.5��4�̪�)�F�S�O�o�|����`��
		int e2 = (int) Math.rint(2.5);
		System.out.println(e1);
		System.out.println(e2);
		int f = (int) Math.ceil(2.5);// ceil�L����i��
		int g = (int) Math.floor(2.5);// floor�L����˱�

		int h1 = (int) Math.sqrt(9); // �������
		int h2 = (int) Math.cbrt(27); // �������
		int i = (int) Math.pow(10, 2);// Math.pow(n,m)�Gn��m����A�ȬOdouble���A
	}

	@Test
	public void StringTest() {
		String st = "1234567";
		// ����
		int a = st.length();
		System.out.println(a);

		// �P�_���e���L�N�q(���b����`�Ψ�)
		String st2 = ""; // �Ŧr��(empty string)�G���e����(�]�O���O�����m)
		String st3 = "    ";// �ťզr��G�S�����N�q���r
		String st4 = new String();// ���إߤ@�ӰO�����m�A�w�]���ťզr��
		String st5 = null; // null���s�O�����m���S��
		System.out.println(st2);
		boolean b1 = st2.isEmpty();// isEmpty�G�P�_�r����׬O�_��0
		boolean b2 = st3.isEmpty();
		System.out.printf("%d,%b\n", st2.length(), b1); // %b�Oboolean������Ÿ�
		System.out.printf("%d,%b\n", st3.length(), b2);
		boolean b3 = st3.isBlank();// isBlank�Gempty�άO����space�A���|��true
		// isBlank�۷��Φײ��ӧP�_���S���F��A�]���q�`�|�γo�ӧP�_�r��]�]���ťչ�ڭ̨S�N�q�^
		// �i�H�Φb�קK�ϥΪ̥���J
		System.out.printf("st3:%d,isBlank??%b\n", st3.length(), b3);

		// StringUtils.hasLength(�ܼƦW��)�G��isEmpty�����G��n�ۤ�(false�~�N��O�Ū��A�]���O�P�_���L����)
		// ��̪��t�O�GhasLength�~�i�H�P�_�O�_��null
		boolean b4 = StringUtils.hasLength(st3);
		// ���O�������ܼƦW�٥h�I�s���z�ѡG�]��isEmpty�O�s�bString���O�̡A��hasLength�O�bStringUtils��
		System.out.printf("st3:%d,hasLength??%b\n", st3.length(), b4);
		boolean b5 = StringUtils.hasLength(st5);
		System.out.printf("st5:�Onull���צL���X��,hasLength??%b\n", b5);
		// StringUtils.hasText(�ܼƦW��)�G�P�_ null + isBlanck�A�q�`���γo��
		boolean b6 = StringUtils.hasText(st5);
		System.out.printf("st5:�Onull���צL���X��,hasLength??%b\n", b6);

	}

	@Test // String���j�M
	public void StringSearchTest() {
		String s1 = "�p�s�k���L�s�p�s";
		System.out.println(s1.contains("�p")); // contains("�j�M���e")�G�P�_�r�ꤤ�O�_�s�b�j�M���e
		System.out.println(s1.charAt(1));// charAt(���ަ�m)�G�^�Ǧb���ަ�m�W���r��(�@�˱q0�}�l)
		System.out.println(s1.indexOf("�s"));// indexOf("�j�M���e")�G�q��m0�}�l�j�M�A�^�ǲĤ@���X�{����m�]�s��"index��"�^
		System.out.println(s1.indexOf("��"));// �j�M����|�^��-1�A�ҥH�i�H�Φb...
		System.out.println(s1.lastIndexOf("�s"));// lastIndexOf("�j�M���e")�G�PindexOf�\��ۦP�A�u�O�q�̥k��}�l��_
		System.out.println(s1.indexOf("�s", 4));// indexOf("�j�M���e", �_�l��m)�G�q�_�l��m�}�l�j�M
	}

	@Test // String������
	public void StringCutTest() {
		String s1 = "�p�s�k���L�s�p�s";
		// substring(�_�l��m)�G�^�ǰ_�l��m�H�᪺�����r��
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 5));// substring(�_�l��m,������m)�F���]�A����(���]�A������m����)
		System.out.println(s1);
		s1 = s1.substring(2);// �n�˦^���G�A�~�|���N���쥻����
		// trim()�G�h���Y�M����space�A���L�k�h��������space
		String s2 = " �p�s�k �� �L�s �p�s ";
		System.out.println(s2.trim());
		// replace(�Q�����e, �������e)�G��Y�@�Ӧr�q���������t�@�ӡF�i�H�Φ���k�A��Ҧ��Y�Ӧr�h��
		String s3 = "�p�s�k���L�s�p�s";
		System.out.println(s3.replace("�s", "Q"));
		System.out.println(s3.replace("�p", "null"));// �n�R���Y�Ӧr�G�i�H��null�Ө��N�Y�Ӧr
		// concat(�s�����e)�G�^�� ��r��ϳs�����e
		System.out.println(s3.concat(s2));
		System.out.println(s3 + s2);// �N�۷��s3+s2
		// replaceAll(���W��F�r��, �������e)�G�]�O��Y�@�Ӧr�q���������t�@�ӡA�t���breplaceAll�i�H�Oregex(���W��F�r��)
	}

	@Test // String���ഫ��ƫ��A
	public void StringChangeTest() {
		String s1 = "�p�s�k�P���L�s�p�s";
		// split(�����I)�G�^�ǥH�ȧ@�����_�������h�Ӧr����q�A�]��������String Array���x�s(�۷��NString�ഫ��String Array)
		String[] ar1 = s1.split("�s");// �J��"�s"�N��
		System.out.println(Arrays.toString(ar1));
		String[] ar2 = s1.split("");// �ΪŦr��""�i�H��C�Ӧr���U�ۦs�_��
		System.out.println(Arrays.toString(ar2));
		// �U�����ӱ`��
		// String.join(�s�����e, �r��}�C�W��)�G�N�r��}�C�����e�H��J���s�����e�����[�_�ӡA���|�����j
		System.out.println(String.join("+", ar1)); // ��}�Car1�A��+���s��
		// toCharArray()�G�N��Ӧr���ഫ��char Array(char���}�C�O�ߤ@�@�ӥi�H�����L�X��)
		System.out.println(s1.toCharArray());
		System.out.println(Arrays.toString(s1.toCharArray()));// ���n�o�˦L�~�O�L�X�}�C���ˤl
		// getChars(�_�I,���I,�r���}�C�W��,�}�C�_�I)�G�i�^���Y�q�r���Jchar Array(�u���r���}�C�~�i�H�γo�Ӥ�k)
		char[] ch = new char[3];
		s1.getChars(2, 5, s1.toCharArray(), 0);// �N�r���}�C�q�_�I����I(���]�A)�A��i�t�@�Ӱ}�C��(��i�h���_�I:�}�C�_�I(0))
		// String.valueOf(�D�r�ꪺ�򥻸�ƫ��A)�G�N�D�r�ꪺ�򥻸�ƫ��A���e�ন�r��
		System.out.println(String.valueOf(90990));
		System.out.println(90990 + ""); // ��r���֪���k�G�����[�W�@�Ŧr��""
		// Integer.valueOf("�r��")�PInteger.parseInt("�r��")�G�N��ƱqString�নInteger
		Integer t = Integer.valueOf("23");
		int g = Integer.parseInt("23");
	}

	@Test // String��������e��(���n!!)
	public void StringvsTest() {
		String a1 = "a";
		String a2 = "a";
		String a3 = new String("a");
		String a4 = "A";
		System.out.println("a1�O�_==a2:" + (a1 == a2));
		System.out.println("a2�O�_==a3:" + (a3 == a2));
		// a1���ŧi��k�|�hString Pool�䨺�@�Ӧr(�ҥHa1��a2���O�h�P�@�ӰO�����m��a)
		// ��new����k�A�N���P�Ыؤ@�ӷs���O�����m(�ҥHa3���O�����m��L�̤��P)
		// ==�O�P�_�O�����m�O�_�ۦP

		// �ҥH�r�ꪺ����n�ΡG.equals(�r��)�G�~�|�i�h�r��̤�����e�O�_�۵�(�Ӥ���==)
		System.out.println(a1.equals(a3));
		// equalsIgnoreCase(�r��)�G�N��Ӧr�곣�ഫ���j�g�i�����A�۷�󤣺ޤj�p�g�i����
		System.out.println(a1.equalsIgnoreCase(a4));
	}

	@Test //�p��r�ꤤ�Y�r���X��
	public void ABCDETest() {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		this.AABB(line);
	}

	public void AABB(String line) {
		int A = this.count(line,"A");
		int B = this.count(line,"B");;
		int C = this.count(line,"C");;
		int D = this.count(line,"D");;
		System.out.printf("A��%d��,B��%d��,C��%d��,D��%d��\n", A, B, C, D);
		int A1 = this.method2(line,'A');
		System.out.println(A1);

	}
	
	public int count(String line, String target) {
		int t = 0;
		int res = 0;
		while (t < line.length()) {
			if (line.indexOf(target, t) != -1) {
				t = (line.indexOf(target, t) + 1);
				res++;
			} else {
				break;
			}
		}
		return res;
	
	}
//��k2	
	public int method2(String line,char target) {
		char[] tt=line.toCharArray();
		int sum=0;
		for(char temp:tt) {
			if(temp==target) {
			sum++;	
			}
		}
		return sum;	
	}
	
//��k3
	public void method3(String line) {
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		String[] a1=line.split("");
		for(int n=0;n<a1.length;n++) {
			switch(a1[n]) {
			case"A":
				a++;
				break;
			case"B":
				b++;
				break;
			case"C":
				c++;
				break;
			case"D":
				d++;
				break;
			}
		}
		System.out.printf("A��%d��,B��%d��,C��%d��,D��%d��\n",a,b,c,d);	
	}

//��k5
	public void method5(String line) {
		int a=0;
		int i=0;
		while(line.indexOf("A",i)!=-1) {
			a++;
			i=line.indexOf("A",i)+1;
		}
	}
	
//��k6�Greplace
	public void methd6(String line) {
		String[] targetArr= {"A","B","C","D"};
		int[] countArr=new int[4];
		for(int i=0;i<targetArr.length;i++) {
		int old=line.length(); //�o�@����}�l�ɪ�����
		line=line.replace(targetArr[i], ""); 
		int newest=line.length();
		countArr[i]=old-newest;
		}
	}
	
//��k4
	@Test //�p��r�ꤤ�Y�r���X�� ���j
	public void ABCDTest() {
		Scanner sc=new Scanner(System.in);
		String topic=sc.nextLine();
		int a=findSamChar(topic,"A",0,0);
	}
	public int findSamChar(String topic,String want,int findEnd,int start) {
		if(topic.indexOf(want,start)==-1) {
			return findEnd;
		}
		start=topic.indexOf(want,start+1);
		findEnd++;
		return findSamChar(topic,want,findEnd,start);
	}	
	
//��k5 �f�t�r����ASCII��
	public void countAlphabet2(String intput) {		
		// 1. �]�w�}�C�s��26�Ӧr�����u�Ӽơv
		int[] countArr = new int[26];
		/*	�ҦpcountArr[0]�OA�B[1]�OB�B[2]�OC...����[25]�OZ
		 *	���ɰ}�C���٨S�����e�A�᭱�|�N�u�Ӽơv��i�}�C��
		 */
	
		// 2. �P�_�r��O�_����
		if (intput.isBlank()) {
			System.out.println("��J���r�ꬰ�šA�Э��s��J");
	
			// 3. �έp�Ӽ�
		} else {
			for (int i = 0; i < intput.length(); i++) {
				// 3-1. ���N�r��C�Ӧr�ର�r��(char)�����A���ର�j�g�A�H�K�@�ӭӧP�_
				char letter = Character.toUpperCase(intput.charAt(i));
				// 3-2. �P�_�C�Ӧr��(char)�O�_�bA-Z���d�򤤡A���Ҽ{��L��
				if (letter >= 'A' && letter <= 'Z') {
					countArr[letter - 'A']++;
					// 3-3. �Y�r����A-Z���䤤�@�ӡA�Ӱ}�C(countArr)�[�@
	
					/* 	���]�r����'C'�A��letter���ȴN�O67(�Ѧ�ASCII��)
					 *	-> �ҥH [letter - 'A'] �N�|�O 67-65 = 2
					 *	-> ���� countArr[2]++ �N�|�O �}�C������2����+1
					 *	-> �ӯ���2���N�OC����m
					 */
				}
			}
	
			// 4. �P�_������A�N�}�C�����u�Ӽơv�L�X��
			for (int i = 0; i < 26; i++) { // 4-1. �}�C�̦h�u�|��26�ӯ���(A-Z)
				if (countArr[i] > 0) { // 4-2. �P�_countArr�O�_���u�Ӽơv��
					System.out.println((char) (i + 'A') + "��" + countArr[i] + "��");
					
					// 4-3. ����
					
					/*	(char) (i + 'A') -> �N��r��
					 *	�� i=0 �B���u�Ӽơv�Ȫ��ܡA���� ( 0 + 65 ) = 65
					 *	�e��(char)�j�ର�r�������A�ҥH(char)(65)�N�|�O'A'
					 *	
					 *	countArr[i] -> �N��u�Ӽơv
					 *	���]�ӼƬ� 2
					 *
					 *	���G�N�|�O -> A��2��
					 */
				}
			}
		}
	}

}
