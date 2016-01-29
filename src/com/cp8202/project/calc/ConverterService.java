package com.cp8202.project.calc;


public class ConverterService {

	
	public double FahrenheitToCelsius(double param1) {
		return (param1 - 32.00) / 1.8d;
	}
	
	public double CelsiusToFahrenheit(double param1) {
		return param1 * 1.8d + 32.00d;
	}
	
	public double MetreToFeet(double param1) {
		return 3.2808399d * param1;
	}
	
	public double FeetToMetre(double param1) {
		return 0.3048d * param1;
	}
	
	public double MetreToYard(double param1) {
		return 1.0936133d * param1;
	}
	
	public double YardToMetre(double param1) {
		return 0.9144d * param1;
	}
	
	public double KilometreToMile(double param1) {
		return 0.62137119d * param1;
	}
	
	public double MileToKilometre(double param1) {
		return 1.609344d * param1;
	}
	
	public double KilogramtoPound(double param1) {
		return 2.2046229d * param1;
	}
	
	public double PoundToKilogram(double param1) {
		return 0.45359231d * param1;
	}
	
	
}
