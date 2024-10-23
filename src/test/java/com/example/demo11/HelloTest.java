package com.example.demo11;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

//�M�׮ج[�U��
//���ج[����
//@SpringBootTest  ���q�{���J�f�I�}�l�B�@�A�|�������{�����򥻰t�m�A�b������դ��e

public class HelloTest {
	// �������O(public class)�@java�{���u���@�ӡA�����M�{���ɮצW�٤@��

	@Test // �n�ϥγ椸���ե����[�W��annotation
	public void helloTest() {
		// �s���v�� �^�Ǹ�ƫ��A ��k�W��(�Ѽ�){��@���e}
		// void�O���^�Ǹ��
		System.out.println("Hello world");
		// println�O�C�L
		// syso + alt + / : �Y�i�ֳt�I�s�X�t�ΦC�L
		// ""�O�r��=��ª���r�A���O�b�g�{��(�S���\���)
	}

	@Test
	public void helloworld() {
		System.out.println(this.helloMaker("1233"));
		// this�O�Ω�I�s��k�j�A���~����k���ܼƮɡA�~�ݭn�K�[
		// �I�s��k�ɡA���צ��S���ǤJ�ѼơA�������[�W�p�A��
		// �pthis.�j�A���~����k�W��(�Ѽ�)
		System.out.println(this.helloMaker2("0", "1", "2"));
	}
	

	public String helloMaker(String inString) {
		// �e�����Ӧ^�ǭȸ�ƫ��AString�O�ǥX�h���F()�̰ѼƬO���i�Ӫ����A
		// String�O�@�Ӧs�x�F�誺�Ŷ�(���@�ӭn���Ѫ�����)
		// �]���ŧi��k�ɡA���n�D�^�Ǧr��A�G����return�r��A�~���|����
		return inString + "world";
	}
	

	public String helloMaker2(String... aa) {
		return aa[1] + "world";
		// �b�ѼƦW�٫e���[�W...�O�}�C=�i��J���u�@�ӰѼơA�ӶǤJ���ѼƥH�}�C(array�A��Ʋզ����@���C)���覡�s�x
		// ���ɪ��ѼƦW�ٷ|�N���}�C���s�x��m(�O����Ŷ�)�A�n���ΰ}�C�������e���[�W[]=���w�}�C���ĴX��(�q�`�q0�}�l)
	}

	@Test
	public void staticFinalTest() {
		System.out.println(Math.PI);
		// ��ctl+�I���G�i�d�ݸӪ��~���ԲӸ�T
		// �]��PI�Q�[�W�Fstatic���e�m�A�ҥH����A�Q�ק�
		// �]��PI������static�A�ҥH���ݭn���Ыؤ~��ϥΡA�ӬO�j�a���s���P�@�ӰO����Ŷ��̪���
		// �ЫجO���إߤ@�ӰO����Ŷ����Ӫ���
	}

	// �ŧi�ܼ�
	@Test
	// �ŧi�ƭ�(��Ƴq�`��int�B�p�Ƴq�`��double)
	// byte
	public void variableTest() {
		byte x = (byte) 2;
		// �j���૬�G�ȫe���[�W(�n�૬������ƫ��A)
		short y = 3;
		// ���⩳�u=�����A�S���Ψ�
		int c = 128;
		long d = 5;
		System.out.println(x);
		float g = (float) 0.5; // �B�I��=�p��
		double h = 0.5;
		char i = '1'; // �r���G�γ�޸��A�u���@�Ӧr�A�w�]�Ȭ�' '(�Ū���޸�)
		char l = 64; // ���Ʀr��Jchar���e�����ɡA�{���|�۰ʸ�Ū����r�s�X�A���ӼƦr�۹������r��(ASCII��)
		System.out.println(l);
		// ���L�ȡG����`�ΡA�ʧO�`��true�N��k�͡Afalse�N��k��
		boolean j = true;
		boolean k = false;
	}

	@Test  //���P����ƫ��A
	public void llTest() {
		System.out.println(2000000000000L);
		// ��������ơA�{���w�]�����A�Oint�A�p�G�n���W�L20�������=����ơA�n�b�Ʀr�᭱�[L
		System.out.println(3.14159268F);
		// �B�I�ơA�{���w�]�����A�Odouble(����ׯB�I�ơA��p��U15���)�A�p�G�n���p���I�U7����=���ׯB�I�ơA�n�b�Ʀr�᭱�[f
		System.out.println("kuha");
		System.out.println('a');
	}
	
	@Test  //�ϥ��ܼ�(�B�J�G�ŧi�ܼ�_���w���_�ϥθ��)
	public void ooTest(){
		int x;  //�ŧi�@�Ӿ���ܼ�x�Ax���̭��N�u�����int���A�����
		x=3;
		System.out.println(x);
		x=40;  //����ܼ�x�̭��˪���ƥi�H�ܤ�(�b�᭱����Ʒ|�л\���e�����)
		      //�`�N���~�g�kint x=3; int x=40;(�Ĥ@�ӷN���۫ŧi����ܼ�x�̩��3�A�᭱���@�ӴN�L�k���ߤF)
		System.out.println(x);
		float n=3.7489324732894F;  //�Ӧh��ƫ�[f�~�O�ŦXn����ƫ��A�A�~�i�H��in�̭�
				System.out.println(n);
	}

	@Test
	public void Test33() {
		// �e����Ȫ��y�{
		int res = 5 / 2;
		System.out.println(res);
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		// ��S���p���I�ɡA�{���|�۰ʱN�Ʀr�z�Ѭ�int(���)�A�]���p�⪺���G�]�|�ξ�Ƥ覡�e�{
		// �ӥu�n������@�ƬO�p�ơA�{���N����H�p�ƪ��覡�h�p��X���G
		double res2 = (double) (5 / 2);
		// �{���p��ɥ���5/2�A�A�N���X�Ӫ����ର�p�ơA�̫��J�p�ƪ��e�����A�ҥH���G�O2.0
		// �{���|������p�A��(�p5/2�S�A���ɡA���N5�j���૬���p��5.0)�A�B����k��
		System.out.println(res2);
	}

	@Test
	public void hardCodeTest() {
		int sum = 1 + 3;
		System.out.println(sum);
		// �W���Ohardcode=��L�g���F(���ץû��O4)�A�������Ӻ��@�B�Q�έק�

		int add1 = 4;
		int add2 = 5;
		// �U���O����n���A�N��@���e�Ψ���ܼƥ]�˰_�ӡA��K���ӭק�Ȫ����e(�u�n�ק��ܼƧY�i)
		int sum2 = add1 + add2;
		System.out.println(sum2);

		// �ٲ����u�ϥΤ@����sum2�A�٬��ΦW�ܼ�
		System.out.println(add1 + add2);
	}

	@Test
	public void stringTest() {
		int a = 1;
		int b = 1;
		System.out.println(a == b);

		String c = "a";
		String d = "a";
		String e = "a";
		System.out.println(c == d);
		System.out.println(e);
		System.out.println(c == e);
		/* = �O�ŧi�F== �O�P�_�O�_�ۦP(��ڤW�O�P�_�O�����m�O�_�@��)
		��ϥΡyString �ܼƦW�� = new String(���e);�z�ɡA�˦��ۦP���e�B�����O�s�W������ܼƦW��
		�A�b�ϥΡu==�v����ɡA���V���P���O�����m�A�G���G���|�۵�
		��ϥΡyString �ܼƦW�� = "���e"; �z��
		 ���סGString������ɶq���n��==*/

		int a1 = 2;
		Integer a2 = null;
		// �j�p�g���A�N��N�q���P
	}
	

	

}
