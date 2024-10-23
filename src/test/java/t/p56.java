package t;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class p56 {
	@Test // 定義一個方法，來求長方形的周長
	public void perimeterTest() {
		perimeter(2, 5);
	}

	public void perimeter(int shorter, int longer) {
		int length = (shorter + longer) * 2;
		System.out.println(length + "");
	}

	@Test // P69
	public void p69Practices() {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		arrayTraversal(arr1);
		System.out.println(arrayBiggest(arr1));
		System.out.println(arrayContains(arr1,9));
	}

	// 陣列遍歷
	public void arrayTraversal(int[] array) {
		System.out.println(Arrays.toString(array));
		System.out.print("[");
		for (int item : array) {
			if (item == array[array.length - 1]) {
				System.out.print(item);
			} else {
				System.out.printf(item + ",");
			}			
		}
		System.out.println("]");
	}
	
	public int arrayBiggest(int[] arr) {
		int max=arr[0];
		for(int item:arr) {
			if(max<item) {
				max=item;
			}
		}
		return max;
	}
	
	public boolean arrayContains(int[] arr,int need) {
//		return Arrays.toString(arr).contains(need+"");
		for(int item:arr) {
			if(need==item) {
				return true;
			}
		}
		return false;
		 
	}
	
	@Test//P70
	public void p70Practice() {
		int[] arrr= {0,1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(copyOfRange(arrr,3,5)));
	}
	
	public int[] copyOfRange(int[] arr,int from,int to) {
		int[] arrcopy=new int[to-from];
		for(int n=from,t=0;n<to;n++,t++) {	
			arrcopy[t]=arr[n];
		}
		return arrcopy;
	}

}
