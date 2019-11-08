package com.perscholas;

import java.util.Scanner;

public class AgeInFiveYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello what is your name?");
		Scanner input = new Scanner(System.in);
		String name = input.next();
;		
		System.out.println(name+" what is your age? ");
		int age = input.nextInt();
		
		System.out.println("You will be "+(age+5)+" years old 5 years from now.");
		System.out.println("You were "+(age-5)+" years old 5 years ago.");
		
		input.close();

	}

}
