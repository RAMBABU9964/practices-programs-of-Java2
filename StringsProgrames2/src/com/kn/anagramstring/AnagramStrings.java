package com.kn.anagramstring;
import java.util.Arrays;
public class AnagramStrings {
public boolean toAnagramString(String st1,String st2) {
	if(st1.length()!=st2.length()) {
		return false;
	}
	char[]crr=st1.toCharArray();
	for(int i=0;i<crr.length;i++) {
	if(crr[i]>=65&&crr[i]<=90) {
		crr[i]=(char)(crr[i]+32);
		}
	Arrays.sort(crr);
	}
	st2=st2.replaceAll("", "").toLowerCase();
	char[]crr2=st2.toCharArray();
	/*for(int j=0;j<crr2.length;j++) {
		if(crr[j]>=65&&crr[j]<=90) {
			crr[j]=(char)(crr[j]+32);
			}
	}*/
	Arrays.sort(crr2);
	if(Arrays.equals(crr, crr2)) {
		
	return true ;
	}
	return false;
	

}
}
