package com.kn.reversestring;

public class ReverseString {
public String reverseString(String inputString) {
	StringBuffer sb1= new StringBuffer();
	for(int i=inputString.length()-1;i>=0;i--) {
		sb1=sb1.append(inputString.charAt(i));
	}
	
	
	return sb1.toString();
}
}
