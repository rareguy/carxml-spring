package com.rifqi.carxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new SUVCar();
		
		myCar.getDailyFuelIntake();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("CarConfig.xml");
		
		Car myBelovedCar = context.getBean("myBelovedCar", TruckCar.class);
		
		myBelovedCar.getDailyFuelIntake();
		
		System.out.println(myBelovedCar);
		
		Car myFiesta = context.getBean("myFordFiesta", HatchbackCar.class);
		
		System.out.println(myFiesta);
		
		context.close();
	}

}
