package com.kn.aggregation;

public class AggregationDemo {

	public static void main(String[] args) {
		Pilot pilot=new Pilot("Flying Beast");
		Airline airline=new Airline("Emirates", pilot);
		
		
		airline.operation();
		
		
		//Shutdown Emirates
		airline=null;
		System.out.println("---> Airline has been ShutDown");
		pilot.fly();

	}

}
