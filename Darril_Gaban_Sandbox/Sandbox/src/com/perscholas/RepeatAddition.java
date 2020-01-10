package com.perscholas;

import java.util.Scanner;

public class RepeatAddition {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// write a program that prompts the student to
		// enter an answer for a question on addition of two single digit integers.

		RepeatAddition ice = new RepeatAddition();
		// while loop booleans
		int again=1;

		// while loop to start the program over
		while (again == 1) {
			ice.calculate();
			
			System.out.println("do the program again? 1:yes 0:no");
			// do the program again answer
			again = input.nextInt();
			
		}

	}

	private void calculate() {
		int answer = 20;

		// get 2 random numbers
		int num1 = (int) (Math.random() * 10), num2 = (int) (Math.random() * 10);

		// loop to get the correct answer
		while (answer != num1 + num2) {

			// prompt user for answer
			System.out.printf("What is the sum of %d and %d?", num1, num2);
			answer = input.nextInt();

			// check answer if correct
			if (answer == num1 + num2) 
				System.out.println("Correct");

			 else // incorrect answer loop back to prompt for answer
				System.out.println("Incorrect try again.");
				
			
		}
	}
}
