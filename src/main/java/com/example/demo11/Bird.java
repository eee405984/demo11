package com.example.demo11;

public class Bird extends Animal {
	// �ϥ�����r extends ���~��Animal���w�����ݩʩM��k
	// 1.�ݩ�name�H�Φs���p���ݩʪ�getter/setter��k
	// 2.eat,sleep��k
	// �H�W���ݩʥH�Τ�k�bAnimal���O�������A���ݭn�A���g�@��

	//�غc��k
	//�b�l���O���n�غc�w�]�غc��k(�S���Ѽƪ��غc��k)
	public Bird() {
		// 1�B�b�I�s�l���O���غc��k���e�A�|���I�s�����O���غc��k�A���ެO�w�]�غc��k�٬O�a���Ѽƪ��غc��k
		// 2�B�Y�Ϯ����I�s�����O��super()��k�A�{���̵M�|������I�s�����O���غc��k
		super(); //�I�s�����O(Animal)
		System.out.println("�o�O�l���O");
		// TODO Auto-generated constructor stub
	}

	//Bird��name�Mage�~�Ӧۤ����OAnimal�A�ҥH�a��name�Mage���غc��k�|�h�I�s�����O���غc��k
	public Bird(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}	
	
	//1�B�l���O�i�H���s�w�q(���P����@���e)�����O����k
	//2�B@Override�N�O�ΨӼаO�l���O���s�w�q�����O����k�G�ثe��Java�����A�������i�ٲ��A��ĳ�[
	//   2-1 @ �OAnnotation�A�����G�|�b�{���X�����ѰT���A�o�ǰT���|�b�sĶ�άO����ɳQ�B�z
	//3�B�Q�l���O���s�w�q����k
	//   3-1 ���v�����i������O�p
	//   3-2 �^�Ǫ���ƫ��A�n�@��
	//   3-3 ��k�W�٩M�p�A�������ѼƼƶq�H�ΨC�ӰѼƪ���ƫ��A���n�@��
	//   3-4 �ߤ@�����P�N�O�j�A��������@���e
	
	@Override
	public void eat() {
		System.out.println(getName() + "�Y����");
	}

	@Override
	public void sleep() {
		System.out.println(getName() + "�Ϋܦh");
	}

	public void flying() {
		// �i�z�L����r super �ӨϥΩw�q�b�����O��public��k
		// �ݩ�name���v���Oprivate�A��u��bAnimal���O���ϥ�
		System.out.println(super.getName() + "���_��");
		// �ثeJAVA�����A�i�H�N����r super �ٲ�
		System.out.println(getName() + "���_��");
	}	

	public void flying2() {
		//�]���ݩ�age�v���Oprotected�A�ҥH�l���O�i�H�����s�����ݩ�
		System.out.println("���~"+age+"��"+getName() + "���_��");
	}
	

}
