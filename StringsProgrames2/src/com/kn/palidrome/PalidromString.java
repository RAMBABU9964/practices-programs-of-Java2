package com.kn.palidrome;

public class PalidromString {
	public boolean palidromString(String inputString) {
		StringBuffer sb1= new StringBuffer();
		for(int i=inputString.length()-1;i>=0;i--) {
			sb1=sb1.append(inputString.charAt(i));
		}
		if(inputString.equals(sb1.toString())) {
			return true  ; 
		}
		return false;
}
}