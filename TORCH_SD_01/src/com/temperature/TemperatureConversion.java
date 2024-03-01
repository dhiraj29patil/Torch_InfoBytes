package com.temperature;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Temperature Value : ");
		double temp = sc.nextDouble();
		
		System.out.println("Enter unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): ");
		String unit = sc.next().toUpperCase();
		
		double fahrenheit = 0;
		double kelvin = 0;
		double celsius = 0;
		
		switch(unit) {
		
		case "F" : 
			fahrenheit = temp;
			celsius = (temp - 32) * 5 / 9;
			kelvin = (temp - 32) * 5 / 9 + 273.15;
			break;
			
		case "K" :
			kelvin = temp;
			fahrenheit = (temp - 273.15) * 9 / 5 + 32;
			celsius = temp - 273.15;
			break;
			
		case "C" : 
			celsius = temp;
			fahrenheit = (temp * 9 / 5) + 32;
			kelvin = temp + 273.15;
			break;
			
		default : 
			System.out.println("Invalid Unit of Measurement");
			break;
		}
		
		System.out.println("Converted to Fahrenheit : "+fahrenheit);
		System.out.println("Converted to Celsius : "+celsius);
		System.out.println("Converted to Kelvin : "+kelvin);

	}

}
