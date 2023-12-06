package com.kn.longeststring;
import java.util.Scanner;
public class LongestStringDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Strings=");
		String str=scan.nextLine();
		scan.close();
		
		LongestestString lingestString=new LongestestString();
		lingestString.longestString(str);
	}

}
