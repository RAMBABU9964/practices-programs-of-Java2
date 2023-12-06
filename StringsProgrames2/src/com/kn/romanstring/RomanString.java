package com.kn.romanstring;
import java.util.Scanner;
public class RomanString {
	public static void main(String[] args) {
		//Creating Ceatione,Declaration,Initalization
	int[]arr= {1000,900,500,400,100,90,50,40,10,5,4,1};
	String[]srr= {"C","CM","D","CD","C","XC","L","XL","X","V","IV","I"};
	Scanner scan=new Scanner(System.in);
	//From user taking element to converte that to roman 
	System.out.println("Enter the Element= ");
	int element=scan.nextInt();
	//creating methode for convert to number to the roman
	findRomanString(arr,srr,element);
	scan.close();
	}
	public static void findRomanString(int[] arr, String[] srr, int element) {
		//converting the string to the stringbuffer
		StringBuffer sb1=new StringBuffer();
		//Array Traversing
		for(int i=0;i<arr.length;i++) {
			while(element>=arr[i]) {
				element=element-arr[i];
				sb1.append(srr[i]);
			}
		}
		//converting the stringbuffer to the string and print the roman string
		System.out.println(sb1.toString());
	}

}
