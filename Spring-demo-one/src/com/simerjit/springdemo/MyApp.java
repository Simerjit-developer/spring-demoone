package com.simerjit.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// create object 
		Coach theCoach = new BaseballCoach();
		
		// use object
		System.out.println(theCoach.getDailyWorkout());
	}

}
