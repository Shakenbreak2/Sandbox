package com.perscholas;

import java.util.Scanner;

public class BMICalculator {
	
	public static void main(String[] args) {
		System.out.println("Hello, we are here to mesure your BMI. \n Please enter your height in meters.");
		Scanner input = new Scanner(System.in);
		double height = input.nextDouble();
		
		System.out.println("Now enter your weight in kilograms. ");
		double weight = input.nextDouble();
		double bmi = weight/(height* height);
		System.out.println("Your BMI is: "+bmi);
		
		input.close();	
	}
}
