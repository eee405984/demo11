package com.example.demo11;

public class MyArray {
	public String toString(String[] array) {
		String str="";
		for(int i=0;i<array.length;i++) {
			if(i==0) {
				str+="[";
			}
			str+=(array[i]+",");
			if(i==array.length-1) {
				str+="]";
				return str;
			}
			str+=(array[i]);
		}
		return str;
	}
	

}
