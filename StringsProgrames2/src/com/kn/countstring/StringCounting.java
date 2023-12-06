package com.kn.countstring;

public class StringCounting {
public int countingString(String input,char ch ) {
	// converting to stringbuffer
	StringBuffer sb1=new StringBuffer();
	// converting to char array
	char []crr=input.toCharArray();
	int count=0;
	for(int i=0;i<crr.length;i++) {
		//condition to check 
	 if(crr[i]==ch) {
		 //condition to count of that char
		 count=count+1;
	 }
	}
	//converting stringbuffer to string
	crr.toString();
	//return the count of the ch
	return count;
	
}}
