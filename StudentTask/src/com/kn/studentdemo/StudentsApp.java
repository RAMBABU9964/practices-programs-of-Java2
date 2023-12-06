package com.kn.studentdemo;
import java.util.Scanner;
public class StudentsApp {
	public void numOfStudent() {
	
Scanner scan=new Scanner(System.in);
System.out.println("Enter the array size= ");
Students[]srr=new Students[scan.nextInt()];

for(int i=0;i<srr.length;i++) {
	System.out.println("enter the id ="+(i+1));
	int id=scan.nextInt();
	System.out.println("enter the name ="+(i+1));
	String name =scan.next();
	System.out.println("enter the marks="+(i+1));
	int marks=scan.nextInt();
	
	srr[i]=new Students(id,name,marks);
			
}}
public String getByID(int id) {
	
	return null;
}}
	
