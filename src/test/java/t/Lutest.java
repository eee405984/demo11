package t;

import java.util.Scanner; //�ϥμзǿ�J(�q�׺ݾ���J���)�B�J1�G���J����Scanner���O
import static org.mockito.ArgumentMatchers.argThat;
import org.junit.jupiter.api.Test;

public class Lutest {
	@Test
	public void texttest() {
		Scanner s = new Scanner(System.in);// �B�J2�G�إߤ@��Scanner����
		System.out.println("�п�J�@�Ӿ��"); // ���ܨϥΪ̿�J�@�Ӿ��
		int x = s.nextInt(); // �q�ϥΪ̨�����o�@�Ӿ�Ʃ�ix��
		System.out.println(x * 10); // ��x���H10���ϥΪ̬�
	}

	@Test // if�P�_��
	public void iftest() {
		// �򥻧Φ�
		System.out.println("�п�J�@�ӼƦr");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		if (number > 100) {
			System.out.println("�o�ӼƦr�j��100");
		}
		// if else(�ϭ�)
		System.out.println("�аݱz�Q����h�ֿ�");
		Scanner s2 = new Scanner(System.in);
		int money = s2.nextInt();
		if (money > 10000) {
			System.out.println("�̦h�ȯണ��1�U��");
		} else {
			System.out.println("�еy��");
		}
		// if...else if...else
		String x = "�^�^";
		if (x == "�B��") {
			System.out.println("�A�O�B��");
		} else if (x == "�^�^") {
			System.out.println("�A�O�^�^");
		} else if (x == "�^�^") {
			System.out.println("�A���M�O�^�^"); // �p�G�W�����Q����F�A�U���N���|�ޤF
		}
	}

	@Test // switch�P�_��
	public void switchtest() {
		int n1 = 3;
		int n2 = 4;
		System.out.println("�п�J�z�Q�����B��(�п�J+ - * /)");
		Scanner s3 = new Scanner(System.in);
		String re = s3.next();
		switch (re) {
		case "+":
			System.out.println(n1 + n2);
			break;
		case "-":
			System.out.println(n1 - n2);
			break;
		case "*":
			System.out.println(n1 * n2);
			break;
		case "/":
			System.out.println((double)n1 / (double)n2);
			break;
		default:
			System.out.println("��J���~");
			break;
		}
	}
	
	@Test //�j��
	public void circletest() {
	/*	int x=2;
		while(x<=6) { //while�j��
			System.out.println(x);
			x=x+2;
		}
		//�D�ءG��while�j��p��1+2+3...+100
		int ans=0;
		int n=1;
		while(n<=100) {
			ans=ans+n;
			n++;
		}
		System.out.println(ans);
		//for�j��
		for(int d=2;d<=6;d=d+2) {
			System.out.println(d);
		}
		//��for�j��p��1+2+3+...+100
		int hi=0;
		for(int m=1;m<=100;m=m+1) {
			hi=hi+m;
		}
		System.out.println(hi);
		
		//�j����O
		for(int i=0;i<=6;i++) {
			if(x%3==0) { //�i�H�Q3�㰣���Ʀr�A0�]�i�H
			  continue;//continue;�j��^��j�骺�W��A�i�J�U�@��
		}
			System.out.println(i);}
		
		int y=0;
		while(y<=6) {
			if(y==4) {break;} //break;�j����j��
			System.out.println(y);
			y++;
		} */
		//�j�����ήרҡG�n�D�ϥΪ̳s���J���쥿�T���� (�p��J�@�ӥ����)
		//�Y����
		/*Scanner s=new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����");
		int t=s.nextInt();
		while(t<=0) {
			System.out.println("��J���~�A�ЦA����J");
			int l=s.nextInt();
			t=l;	
		}
		System.out.println("��J�Ʀr��"+t);*/
	 
	//�Ѯv�@�k
	//�����@�ӭn�D�n�D��J���L���j��A�b��������Ʊ���ɤ~break
	//���F���}�j����~��ϥο�J���Ʀr�A�n���b�~���ؤ@��int
	Scanner r=new Scanner(System.in);
	int d;
	while(true) {
	System.out.println("�п�J�@�ӥ����");
	d=r.nextInt();
	if(d>0) {break;
	}else {
	System.out.println("��J���~�A�A�Ӥ@��");}
	}
	System.out.println("�z�ҿ�J�Ʀr���G"+d);
	}
	
	@Test//�}�C
	public void arraytest() {
		int[] grade=new int[3]; //��l�ư}�C����
		System.out.println("�}�C���סG"+grade.length); //���o�}�C���ת��y�k�G�}�C�W��.length
		grade[0]=67; //�Ĥ@���i67
		int[] row=new int[] {78,89,90}; //�P�ɪ�l�ư}�C���רé�i���
		for(int n=0;n<row.length;n++) { //��for�j��ӳv�@�L�X�}�C�������
			System.out.println(row[n]);
		}
		//�p�⥭����
		int ans=0;
		for(int n=0;n<row.length;n++) {
			ans=ans+row[n];
		}
		System.out.println((double)ans/row.length);	
		//���ΡG�n�D�Ѯv��J�ǥͼƶq�B�C��ǥͪ����Z�A���U��p�⥭������
		System.out.println("�п�J�ǥͼƶq");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] gg=new int[n];
		int total=0;
		System.out.println("�гv�@��J�ǥͦ��Z");
		for(int k=0;k<n;k++) {
			/* ���ΦA���s���o��
			Scanner h=new Scanner(System.in);
			int l=h.nextInt();
			gg[k]=l; */
			gg[k]=s.nextInt();  //�����n�Ds.nextInt()�N�i�H
			total=total+gg[k];
		}
		System.out.println("�ǥͦ��Z���G");
		for(int k=0;k<n;k++) {
			System.out.println(gg[k]);
		}
		System.out.println("�������Z���G"+total/(double)gg.length);
	}
}
