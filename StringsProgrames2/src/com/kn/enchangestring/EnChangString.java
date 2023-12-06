package com.kn.enchangestring;

import java.util.Scanner;

public class EnChangString {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string =");
	String s1=scan.nextLine();
	System.out.println("Enter the number=");
	int num=scan.nextInt();
	
	StringBuffer sb1=new StringBuffer();
	char[]c=s1.toCharArray();
	for(int i=0;i<c.length;i++) {
		if(c[i]>=65&&c[i]<=90) {
			c[i]=(char)(c[i]+num);		
		} else if(c[i]>=97&&c[i]<=122) {
			c[i]=(char)(c[i]+num);
		}	
		if(c[i]>90||c[i]>122) {
			c[i]=(char)(c[i]-26);
		}
	}
	sb1.append(c);
	System.out.println(sb1.toString());
	}
}

