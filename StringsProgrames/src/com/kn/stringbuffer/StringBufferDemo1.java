package com.kn.stringbuffer;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Ram");
		System.out.println("Data = "+sb1);
		System.out.println("Length = "+sb1.length());
        System.out.println("Capacity = "+sb1.capacity());
        
        
        System.out.println("*****************");
        System.out.println();
        
        sb1.append("sita");
        sb1.append("sita");
        sb1.append("sita");
        sb1.append("sita");
        sb1.append(' ');
        System.out.println("Data = "+sb1);
		System.out.println("Length = "+sb1.length());
        System.out.println("Capacity = "+sb1.capacity());  
        
	}

}
