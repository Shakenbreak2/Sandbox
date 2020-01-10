package com.perscholas;

import java.util.Scanner;

public class DumbCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, please enter 3 numbers.");
		
		Scanner input =new Scanner(System.in);
		
		double num1 = input.nextDouble(), num2 = input.nextDouble(), num3=input.nextDouble();
		
		System.out.println(num1+" + "+num2+" + "+num3+" divided by 2 equals "+ (num1+num2+num3)/2);
		
		input.close();

	}

}
