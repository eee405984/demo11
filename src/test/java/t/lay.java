package t;

import static org.mockito.ArgumentMatchers.argThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;
import java.util.Scanner;

public class lay {

	@Test //�I�s��k�P�ɶǤJ��k���ѼƸ��
	public void tj(){
		lay.hello("r");  //�I�s��k ���O�W��.��k�W��(�öǤJ�Ӥ�k���ѼƤ������)
	}
	static void hello(String m) { //�w�q��khello�åt�~�w�q�@�Ӥ�k�Ѽ�m
		System.out.println(m); //��k���{���϶�
	}
	
	@Test //�@�Ӥ�k���w�q�h�ӰѼ�
	public void talking() {
		lay.con("��","�ڬO��");
		lay.con("�A","�A�n");
	}
	static void con(String name,String said) {
		System.out.println(name + ":"+said);
	}
	
	@Test //��k���^�ǭ�
	public void returntest() {
		int po=lay.dd(3,6); //�ŧi�@���ܼ�po�Ӧs��I�s��kdd�o�쪺�^�ǭ�
		System.out.println(po);
	}
	static int dd(int na,int nb) {
		return na+nb; //static �^�ǭȪ���ƫ��A �W��(�ѼƸ�ƫ��A �W��){return �Q�^�Ǫ����}
	}
}

