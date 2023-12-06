package com.kn.longeststring;

public class LongestestString {
public void  longestString(String stl) {
	String[]srr=stl.split(" ");
	String longestword="";
	for(String s:srr) {
		if(s.length()>longestword.length()) {
			longestword=s;
		}
	}
	System.out.print("Longest word= "+longestword);
 	
}
}
