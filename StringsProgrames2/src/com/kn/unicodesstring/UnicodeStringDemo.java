package com.kn.unicodesstring;
import java.util.Scanner;
public class UnicodeStringDemo {
	public static void main(String[] args) {
	    //Taking the input from the user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Strings=");
		String str=scan.next();
		scan.close();
		//call the method frome the unicodestring
		UnicodeString unicodeString=new UnicodeString();
		//Printing the string
		System.out.println(unicodeString.uniCodeString(str));

	}

}
