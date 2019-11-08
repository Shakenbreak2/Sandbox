package com.perscholas;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		/*(year%4==0&&year%100!=0)||(year%400==0)
		 * */
		Scanner hi = new Scanner(System.in);
		System.out.println("Please enter a year");
		int year=hi.nextInt();
		
		if((year%4==0&&year%100!=0)||(year%400==0))
			System.out.printf("%d is a leap year",year);
		else
			System.out.printf("%d is not a leap year",year);
		hi.close();
	}

}
