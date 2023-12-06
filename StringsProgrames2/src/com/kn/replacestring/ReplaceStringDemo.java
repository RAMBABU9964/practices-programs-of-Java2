package com.kn.replacestring;

import java.util.Scanner;

public class ReplaceStringDemo {

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the String= ");
	    String inputString=scan.nextLine();

		ReplaceString str = new ReplaceString();
		String spaces = str.replaceSpaces(inputString);
		System.out.println(spaces);
scan.close();
	}

}
