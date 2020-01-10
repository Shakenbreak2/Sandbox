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
		System.out.printf("Your BMI is: %.2f\n", bmi);
		
		
		if (bmi <18.5) {System.out.println("you are underweight");
		}else if (18.5 <= bmi && bmi < 25.0) {System.out.println("you are of normal weight");
		}else if (25.0 <= bmi && bmi < 30.0) {System.out.println("you are over weight");
		}else if (30.0 <= bmi) {System.out.println("you are obese");
		}
		
		input.close();	
	}
}
