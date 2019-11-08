package assignments;

import java.util.Scanner;

public class EndingLoopWithSentinelValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * write a program that reads and calculates the sum of an unspecified number of
		 * integers. The input 0 signifies the end of the input
		 */
		
		// Create scanner object and store as in variable
		Scanner in = new Scanner(System.in);
		
		// initialize the sum and response variable
		int sum = 0, num1 = 0;
		
		// prompt user to enter a number
		System.out.println("Welcome, add numbers till you are satified then enter 0");
		
		// loop till user enters a 0, add user input to the total sum
		do {
			num1 = in.nextInt();
			sum += num1;
		} while (num1 != 0);
		
		// display the total sum
		System.out.printf("your total sum is %d", sum);
		in.close();
	}

}
