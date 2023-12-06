package com.kn.statices;

public class StaticProgram {
	//static var
static int x,y;
//static block
static
{
	System.out.println("Statice Block");
	x=10;
	y=20;
}
//statice method
public static void disply1() {
	System.out.println("Static Methode");
	System.out.println("x = "+x);
	System.out.println("y = "+y);
	System.out.println("*********************************");
}
//instance var
int a,b;
//instance block
{
	System.out.println("Instance block");
	a=11;
	b=22;
	x=100;
	y=200;
	System.out.println("*********************************");
}
//instance method
public  void disply2() {
	System.out.println("Instance method");
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	System.out.println("x = "+x);
	System.out.println("y = "+y);
}
//constracter
public StaticProgram() {
	System.out.println("Constracter");
}

}
