package com.example.demo11;

public class Dog {//�bClassTest����
	//�ŧi�ݩ�(�S��)�G�~�ءB���B�W�r�B�~��...
	String category;
	
	String color;
	
	String name;
	
	int age;
	
	//�w�q��k(�欰)
	public void runrun() {
		System.out.println("���b�]");
	}
	
	public void runName() {
		System.out.println(name+"���b�]"); //�i�H�����ΤW����name		
	}
	
	public void eat(String name) { //�Ѽƪ��W�٤��n�è��A�~���|�I�s(�ϥ�)�ɤ����D�n�Ǥ���i��
		//�L�X�G�y�y �ܷR�Y�ܦ� �D�y�y
		System.out.println(this.name+"�ܷR�Y�ܦ�"+name);
		//this.�O�I�s�j�A���~�A�B���b�P���O����
	}
	
	//��k���h��overload�G��k�W�٬ۦP�A����k�����ѼƭӼƩάO�Ѽƪ���ƫ��A���@��(�i �H�Ѽƪ��ӼƩάO��ƫ��A�ӰϤ��ۦP�W�٪���k)
	public void runrun(String name) {
		System.out.println(name+"���b�]");
	}
	

}
