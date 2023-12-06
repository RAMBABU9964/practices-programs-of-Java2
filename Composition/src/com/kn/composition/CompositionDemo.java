package com.kn.composition;

public class CompositionDemo {

	public static void main(String[] args) {
		Book book=new Book("Head first java");
		book.readBook();;
		
		
		System.out.println("--->book got stolled<----");
		book=null;
//		book.readBook();
	}

}
