package com.perscholas;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		
		//creates a Scanner object to collect input
		Scanner input = new Scanner(System.in);
		
		//generate random number between 1 and 10
		int rand = (int)(Math.random() * 10) +1;
		int rand2 = (int)(Math.random() * 10) +1;
		
		//outputs numbers to prompt user to enter variable
		System.out.printf("What is %d + %d  \n", rand, rand2);
		
		//store user input in to a variable
		int response = input.nextInt();
		
		//test user response to confirm if it is correct
		if(response == (rand + rand2)) {
			
			//output statement if user is correct
			System.out.println("That answer is correct.");
			
		}else {
			
			//output statement if answer is incorrect
			System.out.println("Try again ;(");
		}
		
		input.close();
	}

}
