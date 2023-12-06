package com.kn.recursiongcd;

public class RecursionGCD {
public int findGCD(int n1,int n2) {
	if(n2==0) {
	return n1;
	}
	else {
		return findGCD(n2,n1%n2);
		
	}
	
}
}
