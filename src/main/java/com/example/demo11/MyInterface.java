package com.example.demo11;

//���������N�O�@�ө�H������A�ҥH����rabstact�i���i�L
//���㪺�g�k�Gpublic abstact interface MyInterface
//�����O��H����A�ҥH�L�k�ϥ�����rnew�ӥͦ����
public interface MyInterface {
	
	//�w�q�b���������ݩ�
	//1�B�v���u��Opublic�άOnomodifier
	//2�B�����n����l��
	int NUM =10;
	public int NUM2 =10;
	//3�B���㪺�g�k(�άO�Q�sĶ�᪺�g�k)�p�U
	//4�B�]���Q�w�q��final�A�O�`�ơA�ҥH�ܼƦW�٭n���j�g�A���P�^��r�����Ω��u�걵
	public static final int NUM3 =10;
	
	//�]�������O�@�ө�H������A�ҥH�w�q�̭�����k�� �O��H��k
	//�u�O����rabstact�@�˥i�ٲ��Apublic abstact void fly() ;
	public void fly();
	
	//�������i�H���w�]����k��@���e(���j�A��)�A���@�w�n�[�W����rdefault
	//�w�]��k���j��@�w�n���s�w�q
	public default void fly2(String name) {
		System.out.println(name + " flying");
	}
	
	//�w�q�b��������static��k�A�@�w�n����@���e
	//static��k�L�k�Q���s�w�q
	public static void fly3(String name) {
		System.out.println(name + " flying");
	}
}
