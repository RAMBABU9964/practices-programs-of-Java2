package com.kn.unicodesstring;
//import java.util.Arrays;
public class UnicodeString {
public String uniCodeString(String input) {
	StringBuffer sb1=new StringBuffer();
	 //converting to char array
	char []crr=input.toCharArray();
	//Arrays.sort(crr);
	//outer loop for iterating over the array
	for(int i=0;i<crr.length-1;i++) {
		// inner loop to find duplicates
		for(int j=i+1;j<crr.length;j++) {
	//condition to check the unicode
		if(crr[i]==crr[j]) {
			crr[i]=' ';
			crr[j]=' ';
			}
		}
	}
	// loop to concat the string
		for(int i=0;i<crr.length;i++) {
			if(crr[i]!=' ')sb1.append(crr[i]);
		}
		//return the unicode 
		return sb1.toString();
		
	}
}	
