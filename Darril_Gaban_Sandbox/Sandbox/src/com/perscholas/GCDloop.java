package com.perscholas;

import java.util.Scanner;

public class GCDloop {

	public static void main(String[] args) {
		
		//initialize variables
		int gcd=1, greaterNum;
		
		//declare scanner object
		Scanner input=new Scanner(System.in);
		
		//prompt for 2 int numbers
		System.out.println("please enter 2 whole numbers, and we will find the greatest commmon divisor");
		int num1 = input.nextInt(), num2 = input.nextInt();
		
		//close scanner
		input.close();
		
		//check which number is larger
		if(num1>num2)
			greaterNum = num1;
		else
			greaterNum = num2;
		
		//run loop to find common divisible numbers: run till i gets to the greatest number
		for(int i=1;i<=greaterNum;i++) {
			if(num1%i==0 && num2%i==0) {
//				System.out.println(i);
				gcd=i;
			}
			
		}
		
		//print greatest common divisor
		System.out.println(gcd);
		
	}

}
