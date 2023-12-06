package com.kn.anagramstring;

import java.util.Arrays;
import java.util.Scanner;
public class AnagramString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first String= ");
		String st1=scan.next();
		System.out.println("Enter the second String= ");
		String st2=scan.next();
       boolean output= SortedString(st1,st2);
       if(output==true) {
       System.out.println(" The Strings are Anagram String ");
       }else {
    	   System.out.println("The String are not Anagram");
       }
       scan.close();
	}
	public static boolean SortedString(String st1, String st2) {
		if(st1.length()!=st2.length()) {
			return false;
		}
		char[]crr=st1.toCharArray();
		for(int i=0;i<crr.length;i++) {
		if(crr[i]>=65&&crr[i]<=90) {
			crr[i]=(char)(crr[i]+32);
			}
		Arrays.sort(crr);
		}
		char[]crr2=st2.toCharArray();
		for(int j=0;j<crr.length;j++) {
			if(crr[j]>=65&&crr[j]<=90) {
				crr[j]=(char)(crr[j]+32);
				}
		Arrays.sort(crr2);
		}
		
		return  Arrays.equals(crr, crr2);
		
		
	}

}
