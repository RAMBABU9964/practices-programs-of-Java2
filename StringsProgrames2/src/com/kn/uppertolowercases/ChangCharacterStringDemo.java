package com.kn.uppertolowercases;

import java.util.Scanner;

public class ChangCharacterStringDemo {
	public static void main(String[] args) {
		// Taking the input from the user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data=");
		String input=scan.nextLine();
		
		//Methed calling from the ChangCharacterString class
		ChangCharacterString changCharacterString=new ChangCharacterString();
		//print the output ofter the changing the char
		System.out.println(changCharacterString.toChangChar(input));
	}
}
