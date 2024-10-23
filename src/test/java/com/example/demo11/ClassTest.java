package com.example.demo11;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class ClassTest {
	@Test
	public void dogTest() {
		//�ϥ�����rnew�ӫإ߹��(instance)(��ګإ�(new)������) (�Ыؤ@���ڪ���)
		Dog myDog=new Dog();
		System.out.println("�ڮa�����~�ءG"+myDog.category); //�w�]��
		System.out.println(myDog.age);
		//�]�w�C�ӹ�Ҥ��P���ݩ�
		myDog.category="þ�z��";
		myDog.color="���o��";
		myDog.name="�y�y";
		myDog.age=7;		
		System.out.println("�ڮa�����~�ءG"+myDog.category);
		
		//�ϥΤ�k(�欰)
		myDog.runrun();
		myDog.runName();
		myDog.eat("�D�y�y");		
	}
	
	@Test
	public void bankTest() {
		Bank user1=new Bank();
		//�]�w�p���ݩʪ����
		user1.setUser("���@�@");
		user1.setBalance(1000);
		
		user1.deposit(-11);
	}
	
	@Test
	public void bankbankTest() {
		Bank bank1=new Bank();
		Bank bank2=new Bank();		
		//�L�X�O�����}(new�X�Ӫ�)
		System.out.println(bank1);
		//���O�G==������O�����}
		System.out.println(bank1==bank2); //false
		Bank bank3=bank1;
		//bank3�Mbank1���V�P�ӰO�����}
		System.out.println(bank1==bank3); //true
		
		//String���ŧi�P����G��new���|�O�s�O�����}�A��=���ȷ|�b�r����̧��ݭ쥻���L�ӭ�(�r����̪��O�i�H���ƧQ�Ϊ��r��)
		String str1="A";
		String str2="A";
		String str3=new String("A");
		System.out.println(str1+str2+str3); //AAA
		System.out.println(str1==str2); //true
		System.out.println(str2==str3); //false
		System.out.println(str2.equalsIgnoreCase(str3)); //�ҥHString�������.equals()�άO.equalsIgnoreCase()
	}
	
	@Test
	public void changedparameterTest() {
		Bank bank=new Bank() {};
		bank.changedparameter2("�Ȧ�","TTA","aaa");
	}
	
	@Test//���j ����(5*4*3*2*1)
	public int factorialTest(int n) {
		if(n==1) { //�פ����
			return 1;
		}else {
			return(n*factorialTest(n-1));
		}
	}
	
	@Test
	public void bankTest2() {
		//�w�]�غc��k
		Bank bank = new  Bank();
		bank.setBranch("TTA");
		bank.setUser("��");
		bank.setBalance(1000);
		//�αa���Ѽƪ��غc��k�p�U
		Bank bank2= new Bank("TTA","��",1000);
	}
	
	@Test
	public void bankTest3() {
		//staticMethod�O�R�A��k�A�i�H�����z�L ���O�W��.��k�W�� �I�s
		Bank.staticMethod();
		//withdraw�O�@���k�A�����������Onew�X�Ӥ~��I�s
		Bank bank=new Bank();
		bank.withdraw(100);
		
		Math.random();
		Random r=new Random();
		r.nextInt();
	}
	


	
	

}
