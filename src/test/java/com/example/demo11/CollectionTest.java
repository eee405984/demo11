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
		// 下面這兩個語法一樣
		Bank bank = new Bank();
		List<Bank> bankList = new ArrayList<>();
		// 把多個Bank放入列表裡
		// List是介面(interface)，只是用來定義方法而已，並無任何實作內容；所以無法使用new建立實例
		// ArrayList是用來實現定義在List中方法的實作類別
		// List <>中的資料型態不能放8種基本資料型態，意思就是只能放類別
	}

	@Test
	public void listTest1() {
		List<String> intList = new ArrayList<>();
		intList.add("A");
		intList.add("B");
		intList.add("B");
		intList.add("D");
		// for loop (迴圈過程中每個元素的編號會改變，所以可能刪不到)
		for (int i = 0; i < intList.size(); i++) {
			if (intList.get(i).equals("B")) {
				intList.remove(i);
			}
			System.out.println(intList.get(i));
		}

		// for each不行新增或刪除
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
		// getFirst和getLast是LinkedList特有的方法
		strList2.getFirst();
	}

	// Set練習
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
		// HashSet的特性：
		// 1、元素不能重複(相同元素只會保留一個)(Set的統一特色)
		// 2、無序(不會依照新增的順序來排列)(每次都會變)
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
		// LinkedHashSet的特性：
		// 1、元素不能重複(相同元素只會保留一個)(Set的統一特色)
		// 2、有序(會依照新增的順序來排列)
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
		// TreeSet的特性：
		// 1、元素不能重複(相同元素只會保留一個)(Set的統一特色)
		// 2、由小到大排序(依ASCIII排序)
	}

	@Test // 隨機產生5個1~10不重複的數字(24-54)
	public void setPractice() {
		Set<Integer> numberSet = new TreeSet<>();
		// 不重複，所以用Set；題目有排序，所以選TreeSet類別
		Random r = new Random();
		while (numberSet.size() < 5) {
			//int number = r.nextInt(1, 11);
			//numberSet.add(number);
			//上述兩行可以直接用匿名變數寫成：
			numberSet.add(r.nextInt(1, 11));
		}
		// 印出由小到大
		System.out.println(numberSet);

		// 印出最大和最小的數
		// 用List存數字(List可以直接存Set，因為同屬於集合(Collection))
		List<Integer> list = new ArrayList<>(numberSet);		
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		//也可以一開始用TreeSet去接，有.first()跟.last()兩個方法
		//或是直接用 ((TreeSet<Integer>)set).first() 把Set強制轉型成TreeSet
		//不過盡量不要強制轉型

		// 印出由大到小
		// 把List反過來存
		List<Integer> newList = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			newList.add(list.get(i));
		}
		System.out.println(newList);
		//Collections.reverse(list); 可以用Collections.reverse(清單名稱)直接把List反轉排序(會覆蓋回去)	
		//TreeSet有.descendingSet()方法可以反轉(降冪)
	}
	
	@Test
	public void mapTest() {
		// Map<Key的資料型態,value 的資料型態>
		Map<Integer,String> map1=new HashMap<>();
		//Map新增元素：.put
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		//.get(key值)：透過key值將對應的value取出 
		String str=map1.get(2);
		System.out.println(map1); //長 {1=A, 2=B, 3=C}
		
		//原本map中。已存在key=1以及對應的value="A"
		//現在在相同1的位置放入"D"，key=1其對應的value會變成"D"
		//相同key(只會有一個對應的value)，對應的value後蓋前
		map1.put(1, "D");
		System.out.println(map1);
		
		//不同的key可以有相同的value值
		map1.put(4, "D");		
		
		//遍歷：用foreach將map中的key-value取出來
		//將map轉成entrySet，item就是包含了key和value，可以使用getKey和getValue取值
		for(Entry<Integer, String> item:map1.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		//將map轉乘keySet，每個item就表示一個key值，透過.get(item)將對應的value取出
		for(Integer item:map1.keySet()) {
			System.out.println("key："+item);
			System.out.println("value："+map1.get(item));
		}		
	}
	
	@Test
	public void mapTest2() {
		//key-value是 1對1
		Map<Integer,String> map1 = new HashMap<>();
		//key-value是 1對多 ：value可以用陣列、List、Set、Map
		Map<Integer,String[]> map2 = new HashMap<>();
		Map<Integer,List<String>> map3 = new HashMap<>();
		Map<Integer,Set<String>> map4 = new HashMap<>();
		Map<Integer,Map<String,String>> map5 = new HashMap<>();
	}
	
	@Test
	public void test123213() {
		//isEmpty()詢問集合或是map的size是否為0
		List<String> list=new ArrayList<>();
		System.out.println(list.isEmpty());
		
		System.out.println("======");
		//
		List<String> list2=null;
		//System.out.println(list2.isEmpty());
		//會報錯，因為list2是null，連記憶體位置都沒有
		//null沒辦法透過.方法()來執行程式 (NullPointerException 空指針錯誤)
	}
	
	//leetcode
	@Test //24-67 兩數之和
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

//		暴力解法：時間複雜度(O)最差
//		for(int n=0;n<arr.length;n++) {
//			for(int m=n+1;m<arr.length;m++) {
//			if(arr[n]+arr[m]==target) {
//				System.out.printf("[%d,%d]",n,m);
//			}	
//			}
//		}				
	}
	
}
