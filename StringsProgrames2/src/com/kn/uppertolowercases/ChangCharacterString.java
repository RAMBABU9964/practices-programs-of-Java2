package com.kn.uppertolowercases;
public class ChangCharacterString {
public String toChangChar(String input) {
	char[]crr=input.toCharArray();
	for(int i=0;i<crr.length;i++) {
		if(crr[i]>=65&&crr[i]<=90) {
			crr[i]=(char)(crr[i]+32);
		} else if(crr[i]>=97&&crr[i]<=122) {
			crr[i]=(char)(crr[i]-32);
		}
	}
		StringBuffer sb1=new StringBuffer();
	for(char c:crr) {
		sb1.append(c);
	}
	return sb1.toString(); 
	
}	
}

