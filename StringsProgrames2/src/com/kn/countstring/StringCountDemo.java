package com.kn.countstring;

import java.util.Scanner;

public class StringCountDemo {

	public static void main(String[] args) {
		//Taking the input from the user
		 Scanner scan=new Scanner(System.in);
		    System.out.println("Enter the String= ");
		    String inputString=scan.nextLine();
		    //taking the char from the user to chack the counts of that char 
		    System.out.println("Enter the Char");
		    char ch=scan.next().charAt(0);
		  //call the method frome the StringCounting
		    StringCounting stringCounting=new StringCounting();
		    //Printing the total count of the given char.
		    System.out.println("The total Count = "+stringCounting.countingString(inputString, ch));
	}

}
