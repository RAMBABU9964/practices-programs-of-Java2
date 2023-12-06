package com.kn.duplicatastrings;

public class DuplicataString {
	
	public String removeDuplicate(String str) {
		
		// coverting to char array
		char[] cs = str.toCharArray();
		StringBuffer buffer= new StringBuffer();
		
	//outer loop for iterating over the array
		for (int i =0;i< cs.length-1; i++) {
   		// inner loop to find duplicates
			for (int j = i+1; j < cs.length; j++) {
			//condition to check the duplicates
				if(cs[i]==cs[j]) {
        		// if  duplicate char the duplicate char to white space char
					cs[j]=' '; 
				}
			}
		}
		// loop to concat the string
		for(int i=0;i<cs.length;i++) {
			if(cs[i]!=' ') {
				buffer.append(cs[i]);
			}
		} 
		//returning the string ofter convert to stringbuffer to string
		return buffer.toString();
		
	}
// {a,' ',b,' ',c,d,' '} s=ab
}
