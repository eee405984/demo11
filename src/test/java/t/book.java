package t;

import static org.mockito.ArgumentMatchers.argThat;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class book {
	@Test//������
	public void sssstest() {
	System.out.printf("Hello");
	System.out.printf(" hi"); //���U�Ӥ�����
	System.out.println("OK");//���U�Ӵ���
	System.out.println("OKl");
	}
	
	//2�i��G0b �� 0B�}�Y�F8�i��G0�}�Y�F16�i��G0x��0X�}�Y�A�䤤10-15�HA-F(a-f)�Ӫ��
	
	@Test//�h�X�r��
	public void uxxxxtest() {
		System.out.println("goo\tqoo"); //�ϱ׽u(�benter�W��)\t��tab��|�ťX�w�]�Ŷ�
		System.out.println("fonding\nnemo"); // \n�O����
	}
	
	@Test
	public void constanttest() {
		//��W�`��(Named Constant)�����|��諸�ƭȡA����final�}�Y
		final int F=36;
	}
	
	@Test //�D�ءG��20�H�A��90���}�G�A�C�H�i�H���o�X���A�ٳѤU�X��
	public void eheufuei() {
		System.out.println("�C�H���o�G"+90/20);
		System.out.println("�ٳѤU�G"+90%20);
	}
	
	@Test //�B�����
	public void mathtest() {
		System.out.println(Math.pow(3,2)); //Math,pow(n,m)�On��m����(�^�Ǭ�double���A)
		int x=10;
		System.out.println(++x * 10);
		}
	
	@Test //�п�J�@�Ӥp��10����ơA�æC�X�Ʀr������
	public void q444(){		
		int d;
		while(true) {
		 System.out.println("�п�J�@�Ӥp��10�����");
		 Scanner s=new Scanner(System.in);
		 d=s.nextInt();
		 if(d<=10) {break;
			 }else {
				 System.out.println("��J���~");
			 }}
		 System.out.println("��J���Ʀr��"+d);
		 System.out.println("���謰�G"+d*d);		
	}
	
	@Test //���ߦPŢ�G�@�@��35���ʪ��A100���}
	public void chiratest() {
		int rabbit=35;
		while(true) {
			if(rabbit*4+(35-rabbit)*2==100) {break;}
			rabbit--;
		}
		System.out.println("�ߤl��"+rabbit+"��");
	}
	
	@Test //�q�Ʀr
	public void p620() {
		int ans=40;
		System.out.println("�п�J�@�Ӿ��");
		Scanner s=new Scanner(System.in);
		int nu=s.nextInt();
		int con=1;
		while(true) {
			if(nu<40) {
				System.out.println("�вq�j�@�I");
			}
			else if(nu>40) {System.out.println("�вq�p�@�I");}
			else{break;}
			nu=s.nextInt();
			con++;
		}
		System.out.println("���߲q��!!  �`�@�q�F"+con+"��");
		
	}
	
	
	
	
	
}
