package com.example.demo11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class CollectionTest {

	@Test
	public void listTest() {
		// �U���o��ӻy�k�@��
		Bank bank = new Bank();
		List<Bank> bankList = new ArrayList<>();
		// ��h��Bank��J�C���
		// List�O����(interface)�A�u�O�Ψөw�q��k�Ӥw�A�õL�����@���e�F�ҥH�L�k�ϥ�new�إ߹��
		// ArrayList�O�Ψӹ�{�w�q�bList����k����@���O
		// List <>������ƫ��A�����8�ذ򥻸�ƫ��A�A�N��N�O�u������O
	}

	@Test
	public void listTest1() {
		List<String> intList = new ArrayList<>();
		intList.add("A");
		intList.add("B");
		intList.add("B");
		intList.add("D");
		// for loop (�j��L�{���C�Ӥ������s���|���ܡA�ҥH�i��R����)
		for (int i = 0; i < intList.size(); i++) {
			if (intList.get(i).equals("B")) {
				intList.remove(i);
			}
			System.out.println(intList.get(i));
		}

		// for each����s�W�ΧR��
//		for(String item:intList) {
//			if(item=="C") {
//				intList.remove(item);
//			}
//		}			
	}

	@Test
	public void listTest2() {
		List<String> strList = new LinkedList<>();
		LinkedList<String> strList2 = new LinkedList<>();
		// getFirst�MgetLast�OLinkedList�S������k
		strList2.getFirst();
	}

	// Set�m��
	@Test
	public void setTest() {
		Set<String> strHashSet = new HashSet<>();
		strHashSet.add("A");
		strHashSet.add("C");
		strHashSet.add("A");
		strHashSet.add("B");
		strHashSet.add("F");
		strHashSet.add("D");
		strHashSet.add("E");
		strHashSet.add("B");
		System.out.println(strHashSet.toString());
		// HashSet���S�ʡG
		// 1�B�������୫��(�ۦP�����u�|�O�d�@��)(Set���Τ@�S��)
		// 2�B�L��(���|�̷ӷs�W�����ǨӱƦC)(�C�����|��)
	}

	@Test
	public void linkedHashSetTest() {
		Set<String> strSet = new LinkedHashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");
		System.out.println(strSet.toString());
		// LinkedHashSet���S�ʡG
		// 1�B�������୫��(�ۦP�����u�|�O�d�@��)(Set���Τ@�S��)
		// 2�B����(�|�̷ӷs�W�����ǨӱƦC)
	}

	@Test
	public void treeSetTest() {
		Set<String> strSet = new TreeSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");
		System.out.println(strSet.toString());
		// TreeSet���S�ʡG
		// 1�B�������୫��(�ۦP�����u�|�O�d�@��)(Set���Τ@�S��)
		// 2�B�Ѥp��j�Ƨ�(��ASCIII�Ƨ�)
	}

	@Test // �H������5��1~10�����ƪ��Ʀr(24-54)
	public void setPractice() {
		Set<Integer> numberSet = new TreeSet<>();
		// �����ơA�ҥH��Set�F�D�ئ��ƧǡA�ҥH��TreeSet���O
		Random r = new Random();
		while (numberSet.size() < 5) {
			//int number = r.nextInt(1, 11);
			//numberSet.add(number);
			//�W�z���i�H�����ΰΦW�ܼƼg���G
			numberSet.add(r.nextInt(1, 11));
		}
		// �L�X�Ѥp��j
		System.out.println(numberSet);

		// �L�X�̤j�M�̤p����
		// ��List�s�Ʀr(List�i�H�����sSet�A�]���P�ݩ󶰦X(Collection))
		List<Integer> list = new ArrayList<>(numberSet);		
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		//�]�i�H�@�}�l��TreeSet�h���A��.first()��.last()��Ӥ�k
		//�άO������ ((TreeSet<Integer>)set).first() ��Set�j���૬��TreeSet
		//���L�ɶq���n�j���૬

		// �L�X�Ѥj��p
		// ��List�ϹL�Ӧs
		List<Integer> newList = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			newList.add(list.get(i));
		}
		System.out.println(newList);
		//Collections.reverse(list); �i�H��Collections.reverse(�M��W��)������List����Ƨ�(�|�л\�^�h)	
		//TreeSet��.descendingSet()��k�i�H����(����)
	}
	
	@Test
	public void mapTest() {
		// Map<Key����ƫ��A,value ����ƫ��A>
		Map<Integer,String> map1=new HashMap<>();
		//Map�s�W�����G.put
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		//.get(key��)�G�z�Lkey�ȱN������value���X 
		String str=map1.get(2);
		System.out.println(map1); //�� {1=A, 2=B, 3=C}
		
		//�쥻map���C�w�s�bkey=1�H�ι�����value="A"
		//�{�b�b�ۦP1����m��J"D"�Akey=1�������value�|�ܦ�"D"
		//�ۦPkey(�u�|���@�ӹ�����value)�A������value��\�e
		map1.put(1, "D");
		System.out.println(map1);
		
		//���P��key�i�H���ۦP��value��
		map1.put(4, "D");		
		
		//�M���G��foreach�Nmap����key-value���X��
		//�Nmap�নentrySet�Aitem�N�O�]�t�Fkey�Mvalue�A�i�H�ϥ�getKey�MgetValue����
		for(Entry<Integer, String> item:map1.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		//�Nmap�୼keySet�A�C��item�N��ܤ@��key�ȡA�z�L.get(item)�N������value���X
		for(Integer item:map1.keySet()) {
			System.out.println("key�G"+item);
			System.out.println("value�G"+map1.get(item));
		}		
	}
	
	@Test
	public void mapTest2() {
		//key-value�O 1��1
		Map<Integer,String> map1 = new HashMap<>();
		//key-value�O 1��h �Gvalue�i�H�ΰ}�C�BList�BSet�BMap
		Map<Integer,String[]> map2 = new HashMap<>();
		Map<Integer,List<String>> map3 = new HashMap<>();
		Map<Integer,Set<String>> map4 = new HashMap<>();
		Map<Integer,Map<String,String>> map5 = new HashMap<>();
	}
	
	@Test
	public void test123213() {
		//isEmpty()�߰ݶ��X�άOmap��size�O�_��0
		List<String> list=new ArrayList<>();
		System.out.println(list.isEmpty());
		
		System.out.println("======");
		//
		List<String> list2=null;
		//System.out.println(list2.isEmpty());
		//�|�����A�]��list2�Onull�A�s�O�����m���S��
		//null�S��k�z�L.��k()�Ӱ���{�� (NullPointerException �ū��w���~)
	}
	
	//leetcode
	@Test //24-67 ��Ƥ��M
	public void mapPractice() {
		int target=9;
		int[] arr= {2,7,11,15};
		Map<Integer,Integer> map=new HashMap<>();
		for(int n=0;n<arr.length;n++) {
			if(map.containsKey(target-arr[n])) {
				System.out.printf("[%d,%d]",map.get(target-arr[n]),n);
			}
			map.put(arr[n], n);
		}

//		�ɤO�Ѫk�G�ɶ�������(O)�̮t
//		for(int n=0;n<arr.length;n++) {
//			for(int m=n+1;m<arr.length;m++) {
//			if(arr[n]+arr[m]==target) {
//				System.out.printf("[%d,%d]",n,m);
//			}	
//			}
//		}				
	}
	
}
