package com.kn.stringcomparession;
public class StringComprassionDemo {
public static void main(String[] args) {
	String s1= "Ram";
	String s2= "Ram";
	
	if(s1==s2) {
		System.out.println("Referance are pointed to same odject");
	}else {
	
   System.out.println("Referance are pointed not same odject");
}
	if(s1.equals(s2)) {
		System.out.println("String object data is equal");
	}else {
		System.out.println("String object data is not equal");
	}
	}
}
