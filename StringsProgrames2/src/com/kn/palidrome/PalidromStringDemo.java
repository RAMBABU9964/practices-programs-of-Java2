package com.kn.palidrome;

import java.util.Scanner;
public class PalidromStringDemo {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the String= ");
	    String inputString=scan.nextLine();
	    
	    //Creat the object of class returen
	    PalidromString palidromString1=new PalidromString();
	    
	    //call the method revers String
	    boolean output=palidromString1.palidromString(inputString);
	    
	    //Print the Reversing String
	   System.out.println("The Palidrom String="+output);
	    
	    scan.close();

		}
}
