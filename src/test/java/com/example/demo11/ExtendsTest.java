package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ExtendsTest {
	@Test
	public void animalTest() {
		Animal ani=new Animal();
		ani.setName("ANI");
		ani.eat();
		ani.sleep();
	}
	
	@Test
	public void animalTest2() {
		Animal ani=new Animal("ANI",5); //�a���Ѽƪ��غc��k
		ani.eat();
		ani.sleep();
	}	
	
	@Test
	public void birdTest() {
		Bird bird=new Bird();
		bird.setName("BIRD");
		bird.eat();
		bird.sleep();
		bird.flying();
	}

	@Test
	public void birdTest2() {
		Bird bird=new Bird("BIRD",5);
		bird.eat();
		bird.sleep();
		bird.flying();
	}
	
	@Test
	public void fatherTest() {
		Father father=new Father("FA");
		father.walk();
	}
	
	@Test
	public void sonTest() {
		Son son=new Son("SON");
		son.playBall();
	}
	
	@Test
	public void birdTest3() {
		//���M���^�Ӫ���ƫ��A�O�����O�A���]��new�X�Ӫ���ҬO�l���O�A�ҥH����W�N�O�l���O
		Animal bird=new Bird("BIRD",5);
		// eat()�Msleep() ���檺�|�O�b�l���O�����s�w�q����@���e
		bird.eat();
		bird.sleep();
		//�H�U��k�L�k�Q�I�s�A�]���S���Q�w�q�b�����O��
//		bird.flying();
		//��X�H�W�A��s�إߥX�Ӫ��l���O��ҡA���ƫ��A�O�����O�ɡG
		//1�B�u��I�s�w�q�b�����O������k
		//2�B��l���O�����s�w�q�����O����k�ɡA���檺�|�O�l���O����@���e
		
	}
	
	@Test
	public void birdTest4() {
		Bird bird=new Bird("BIRD",5);
		//���檺�O�w�q�bbird������@���e
		bird.flying();
		//���s�w�q flying() ����k
		//1�B�b�إ߷s����Үɪ��������s����@���e�A�Y�[�W�j�A��
		//2�B�j�A���n�g�b�������e�A�B�����@�w�n������
		//3�B���s�w�q����@���e�N�Ȧ��b�o������
		//4�B @Override �i���i�L�A����ĳ�[
		Bird bird2=new Bird("BIRD",5) {
			@Override
			public void flying() {
				System.out.println("�³��í�");
			}			
		};
		bird2.flying();
		bird.flying();
	}
	
	@Test
	public void interFaceTset() {
		MyInterface my=new MyInterfaceImpl();
		System.out.println(my.NUM);
		System.out.println(MyInterface.NUM);
	}
	
	@Test
	public void interfaceTest2() {
//		Person person=new Person();
//		Human human=new Human();
//		Car car=new Car();
//		person.running();
//		human.running();
//		car.running();
		
		Submarine sub=new Submarine();
		sub.diving();
		sub.moving();
		sub.moving2();
		
		Boat boat=new Submarine();
		boat.moving();
		
	
	}


}
