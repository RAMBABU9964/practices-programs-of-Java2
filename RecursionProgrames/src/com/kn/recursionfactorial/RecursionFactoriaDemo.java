package com.kn.recursionfactorial;

import java.util.Scanner;

public class RecursionFactoriaDemo {

	public static void main(String[] args) {
		// Take input from user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to find factorial=");
		int input=scan.nextInt();
		//call the methode from the recursionfactorial
		RecursionFactoria1 factorial=new RecursionFactoria1();
		//print the factorial
		System.out.println("The Factorial "+input+" is "+factorial.findFactorial(input));
       scan.close();
	}

}
