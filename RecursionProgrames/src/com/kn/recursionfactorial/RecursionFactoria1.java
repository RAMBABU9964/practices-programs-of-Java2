package com.kn.recursionfactorial;

public class RecursionFactoria1 {
public int findFactorial(int input) {
	if(input==1) {
	return input;
	}else {
		return input*findFactorial(input-1);
	}
}
}
