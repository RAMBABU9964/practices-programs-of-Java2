package com.kn.uppercase;

import java.util.Scanner;

public class ToUpperCaseStringDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data=");
		String input=scan.nextLine();
		
		
		ToUpperCaseString toUpperCaseString=new ToUpperCaseString();
		String output=toUpperCaseString.toUpperCase(input);
		System.out.println(output);

	}

}
