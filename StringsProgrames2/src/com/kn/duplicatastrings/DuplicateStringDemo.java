package com.kn.duplicatastrings;
import java.util.Scanner;
public class DuplicateStringDemo {
	public static void main(String[] args) {
		//Taking the input from the user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Strings=");
		String str=scan.next();
		scan.close();
		//call the method frome the duplicatestring 
	DuplicataString string = new DuplicataString();
	//Printing the string ofter removing the duplicata in string
	System.out.println(string.removeDuplicate(str) );
	}
}
