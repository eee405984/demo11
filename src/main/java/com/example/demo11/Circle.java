package com.example.demo11;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("�e���");
	}

	//�Q�~�Ӫ�Shape���O���A�]�����w�q��H��kdraw1()�A�ҥH�o�Ӥ�k�����n�Q���s�w�q
	@Override
	public void draw1() {
		System.out.println("�e���A�@��S�@��");
	}
	
	//�`�ơG�ܼƦW�٥��j�g�A���P�^��r�����Ω��u�걵
	public final int MAX_NUMBER = 10 ;
	//�@�몺�ݩ��ܼơA�Τp�m�p�覡�R�W�ܼ�
	private String minNumber;
	

}
