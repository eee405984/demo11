package com.example.demo11;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class LecPratice {

	@Test
	public void lec2q1() {
		System.out.println();
	}

	@Test
	public void lec2q2() {
		int a = 10;
		System.out.println(a++ * 10); // a++竚
		a = 10;
		System.out.println(++a * 10);// ++a玡竚
	}

	@Test // 单畉计㎝
	public void lec2q3() {
		System.out.println(this.dfghhfiuw(1, 100));
	}

	public int dfghhfiuw(int start, int end) {
		return (start + end) * (end - start + 1) / 2;
	}

	@Test // 放锣传
	public void temperature() {
		System.out.println(this.CReturnF(23));
		System.out.println(this.FReturnC(180));
	}

	public double CReturnF(double c) {
		return c * 9 / 5 + 32;
	}

	public double FReturnC(double f) {
		return (f - 32) * 5 / 9;
	}

	@Test // 猭
	public void uiuafiufia() {
		int n = 1;
		while (n <= 9) {
			int m = 1;
			while (m <= 9) {
				System.out.printf("%d*%d=%2d ", n, m, n * m);
				m++;
			}
			System.out.println();
			n++;
		}
	}
		
	@Test //do while糶单畉
	public void dovjjrf() {
		System.out.println(this.rgjioeiog(1,100));
	}
		
	public int rgjioeiog(int start,int end) {
		int sum=0;
		do {
			sum+=start;
			start++;
		}while(start<=end);
		return sum;
	}
	
	
	

}
