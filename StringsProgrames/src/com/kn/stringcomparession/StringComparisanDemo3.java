package com.kn.stringcomparession;

public class StringComparisanDemo3 {
	public static void main(String[] args) {
		String s1= "Ram";
		String s2= "Sita";
		String s3="ram"+"sita";
		String s4="ram"+"sita";
		//Referenc Comparison
		if(s3==s4) {
			System.out.println("Referance are  same ");
		}else {
		
	   System.out.println("Referance are different");
	}
		//String Data Comparison
		if(s3.equals(s4)) {
			System.out.println("String data is equal");
		}else {
			System.out.println("String data is unequal");
		}
		}
}
