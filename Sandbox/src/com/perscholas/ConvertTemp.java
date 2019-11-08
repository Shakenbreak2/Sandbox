package com.perscholas;

import java.util.Scanner;

public class ConvertTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number for Fahrenheit. ");
		Scanner temp = new Scanner(System.in);
		
		double fahrenheit = temp.nextDouble();
		double x = 5.0/9.0;
		double celsius =(fahrenheit-32)*x;
		temp.close();
		
		System.out.println(fahrenheit +" degrees F is "+celsius+ " degrees C");
	}

}
