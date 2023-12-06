package com.kn.aggregation;

public class Pilot {
String name;

public Pilot(String name) {
	this.name = name;
}

public void fly() {
	System.out.println(this.name+" Starting to fly");
}
}
