package com.kn.stringcomparession;

public class StringComprassionDemo2 {
	public static void main(String[] args) {
		String s1= new String("Sita");
		String s2= new String("Sita");
		
		if(s1==s2) {
			System.out.println("Referance are pointed to same odject");
		}else {
		
	   System.out.println("Referance are pointed different odject");
	}
		if(s1.equals(s2)) {
			System.out.println("String object data is equal");
		}else {
			System.out.println("String object data is unequal");
		}
		}
}
