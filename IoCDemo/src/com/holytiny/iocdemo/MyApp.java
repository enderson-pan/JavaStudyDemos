package com.holytiny.iocdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyApp {

	public static void main(String[] args) {
		
//		 Version 1. Hard coded.		
//		// Create the object
//		Porsche porscheCar = new Porsche();
//		
//		// Use the object
//		System.out.println(porscheCar.brand());
		
//		// Version 2. Program to interface;
//		// Create the object.
//		Car theCar = new Mercedes();
//		
//		// use the object.
//		System.out.println(theCar.brand());
		
		// Version 3. Program to object factory;		
//		try {
//			// Create the object.
//			System.out.println("Please choose a car (Porsche or Mercedes):");
//			String input = "";
//	        InputStreamReader in = new InputStreamReader(System.in);
//	        BufferedReader bufferedReader = new BufferedReader(in);
//	        input = bufferedReader.readLine();
//	        
//	        // Simple factory pattern
//	        Car theCar = null;
//	        switch(input) {
//	        case "Porsche":
//	        	theCar = new Porsche();
//	        	break;
//	        	
//	        case "Mercedes":
//	        	theCar = new Mercedes();
//	        	break;
//	        	
//	        	default:
//	        		System.out.println("Please input the correct car brand.");
//	        		throw new Exception("Incorrect car brand!");
//	        }
//	        
//			// use the object.
//			System.out.println(theCar.brand());
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		// Version 4 DI
		try {
			// Create the object.
			System.out.println("Please choose a car (Porsche or Mercedes):");
			String input = "";
	        InputStreamReader in = new InputStreamReader(System.in);
	        BufferedReader bufferedReader = new BufferedReader(in);
	        input = bufferedReader.readLine();
	        
	        // Simple factory pattern
	        Car theCar = null;
	        switch(input) {
	        case "Porsche":
	        	theCar = new Porsche();
	        	break;
	        	
	        case "Mercedes":
	        	theCar = new Mercedes();
	        	break;
	        	
	        	default:
	        		System.out.println("Please input the correct car brand.");
	        		throw new Exception("Incorrect car brand!");
	        }
	        
	        // DI
	        CarRunner theRunner = new CarRunner(theCar);
	        
			// use the object.
			System.out.println(theRunner.info());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
