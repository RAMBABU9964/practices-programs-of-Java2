package com.kn.reversestring;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the String= ");
    String inputString=scan.nextLine();
    
    //Creat the object of class returen
    ReverseString reverseString=new ReverseString();
    
    //call the method revers String
    //String outputString=reverseString.reverseString(inputString);
    
    //Print the Reversing String
    System.out.println("The revers string = "+reverseString.reverseString(inputString));
    
    
    scan.close();

	}

}
