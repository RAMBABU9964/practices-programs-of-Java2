package com.kn.countstrings;
import java.util.Scanner;
public class CountStrings {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String Data= ");
		String input=scan.nextLine();
		CharacterCounts count=toCountStrings(input);
System.out.println("Upper Case Voweals = "+count.uppercasevowels);
System.out.println("uppercase consonanta = "+count.uppercaseconsonants);
System.out.println("LowerCase Voweals = "+count.lowercasevowels);
System.out.println("uppercase consonanta = "+count.lowercaseconsonants);
System.out.println("digits = "+count.digits);
System.out.println("spaces = "+count.spaces);
System.out.println("Special caracters = "+count.specials);
scan.close();
	}

	public static CharacterCounts toCountStrings(String input) {
		
		CharacterCounts count=new CharacterCounts();
		char[] crr=input.toCharArray();
		for(int i=0;i<crr.length;i++) {
			if(crr[i]>=65&&crr[i]<=90) {
				if(crr[i]=='A'||crr[i]=='E'||crr[i]=='I'||crr[i]=='O'||crr[i]=='U') {
					count.uppercasevowels++;
				}else {
					count.uppercaseconsonants++;
				}}
				else if(crr[i]>=97&&crr[i]<=122) {
					if(crr[i]=='a'||crr[i]=='e'||crr[i]=='i'||crr[i]=='o'||crr[i]=='u') {
						count.lowercasevowels++;
					}else {
						count.lowercaseconsonants++;
					}
				}
				else if(crr[i]>=48&&crr[i]<=57) {
					count.digits++;
				}
				else if(crr[i]>=58&&crr[i]<=64) {
					count.specials++;
				}
				else {
					count.spaces++;
				}
			}
		return count;
	}

}
