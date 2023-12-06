package com.kn.recursiongcd;
import java.util.Scanner;
public class RecursionGCDDemo {
	public static void main(String[] args) {
		// Take input from the user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number=");
		int n1=scan.nextInt();
		System.out.println("Enter the second number=");
		int n2=scan.nextInt();
		
		RecursionGCD gcd=new RecursionGCD();
		int result=gcd.findGCD(n1, n2);
		System.out.println("The GCD of "+n1+" and "+n2+" is "+result);

	}

}
