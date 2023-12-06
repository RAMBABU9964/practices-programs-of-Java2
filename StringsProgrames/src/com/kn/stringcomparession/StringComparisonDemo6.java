package com.kn.stringcomparession;

public class StringComparisonDemo6 {

	public static void main(String[] args) {
		String s1="Raja Ram Mohan Roy  ";
		
		System.out.println("To convert data in uppar case");
		System.out.println(s1.toUpperCase());
		System.out.println("To convert data in lower case");
		System.out.println(s1.toLowerCase());
		System.out.println("Return the character at spicified indix");
		System.out.println(s1.charAt(7));
		System.out.println("Return index valu for first occurance of specified character ");
		System.out.println(s1.indexOf('a'));
		System.out.println("Return index valu for last occurance of specified character ");
		System.out.println(s1.lastIndexOf('a'));
		System.out.println("Return String starting from spicified index");
		System.out.println(s1.substring(5));
		System.out.println("Return String starting from begining index till ending index");
		System.out.println(s1.substring(9,14));
		System.out.println("Return true if specified string found else false");
		System.out.println(s1.contains("Ram"));
		System.out.println("Return true if specified string found else false");
		System.out.println(s1.contains("Rama"));
		System.out.println("Return length of specified string");
		System.out.println(s1.length());
		System.out.println(" Return true if string starts with spicified string");
		System.out.println(s1.startsWith("Ra"));
		System.out.println("Return true if string ends with spicified string");
		System.out.println(s1.endsWith("oy"));
		System.out.println("Return character using spicified char ");
		char[]crr=s1.toCharArray();
		System.out.println(s1.length());
		System.out.println(crr.length);
		for(int i=crr.length-1;i>=0;i--) {
			System.out.print(crr[i]);
		}
		System.out.println(" ");
		System.out.println("Returns Array of string splited using spicifted regex(delimiter) ");
		String[]srr=s1.split(" ");
		for(int i=0;i<srr.length;i++) {
			System.out.print(i+" = "+srr[i]);
		}
		System.out.println("");
		for(int i=srr.length-1;i>=0;i--) {
			System.out.print(srr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Returen string removing additional space ");
		System.out.println(s1.trim());//removing additional spaceses leading and triling spaceses ex="  ram mohan  "
		System.out.println("Returns String replacing the substring");
		System.out.println(s1.replace("Mo", "Pa"));
		System.out.println("Returns String replacing the substring");
		System.out.println(s1.replaceAll("Mohan", "Prabhas"));
		
	}

}
