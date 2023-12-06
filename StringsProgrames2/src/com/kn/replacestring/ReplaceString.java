package com.kn.replacestring;

public class ReplaceString {
	
	public String replaceSpaces(String str) {
		
		return str.replaceAll(" ", "\\$");
	}
}
