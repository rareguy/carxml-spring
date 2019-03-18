package com.rifqi.carxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new SUVCar();
		
		myCar.getDailyFuelIntake();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("CarConfig.xml");
		
		// Injecting object and its dependency via constructor from XML file
		Car myBelovedCar = context.getBean("myBelovedCar", Car.class);
		
		myBelovedCar.getDailyFuelIntake();
		
		System.out.println(myBelovedCar.getDestinationService().getDestination());
		
		// Injecting property values from XML file
		Car myFiesta = context.getBean("myFordFiesta", Car.class);
		
		System.out.println(myFiesta);
		
		context.close();
	}

}
