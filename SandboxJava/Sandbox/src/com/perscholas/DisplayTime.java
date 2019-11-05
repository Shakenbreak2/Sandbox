package com.perscholas;

import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number of seconds: ");
		Scanner input = new Scanner(System.in);
		
		int time = input.nextInt();
		int calMinutes = time/60;
		int calSeconds = time%60;
		
		input.close();
		
		System.out.println(time+" seconds is "+calMinutes+" minutes and "+calSeconds+" seconds. ");
	}

}
