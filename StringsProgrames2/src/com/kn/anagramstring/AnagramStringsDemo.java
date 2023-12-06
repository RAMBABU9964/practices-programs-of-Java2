package com.kn.anagramstring;
import java.util.Scanner;
public class AnagramStringsDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first String= ");
		String st1=scan.next();
		System.out.println("Enter the second String= ");
		String st2=scan.next();
		
		AnagramStrings anagramStrings=new AnagramStrings();
		boolean output=anagramStrings.toAnagramString(st1, st2);
		if(output==true) {
		       System.out.println(" The Strings are Anagram String ");
		       }else {
		    	   System.out.println("The String are not Anagram");
		       }
		       scan.close();
	}

}
