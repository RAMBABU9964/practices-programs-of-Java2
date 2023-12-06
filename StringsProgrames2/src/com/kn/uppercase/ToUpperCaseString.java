package com.kn.uppercase;
public class ToUpperCaseString {
public String toUpperCase(String inputString) {
     StringBuffer sb1=new StringBuffer();
     String[] s1=inputString.split(" ");
     for(int i=0;i<s1.length;i++) {
    	 char[]crr=s1[i].toCharArray();
    	 
    	 for(int j=0;j<2;j++) {
    		 if(crr[0]>=97&&crr[0]<=122) {
    			 crr[0]=(char)(crr[0]-32);
    		 }
    	 }
    	 
    	 for(char c:crr) {
    		 sb1.append(c);
    	 }   sb1.append(" "); 	 
     }
     
	return sb1.toString();	
}
}
