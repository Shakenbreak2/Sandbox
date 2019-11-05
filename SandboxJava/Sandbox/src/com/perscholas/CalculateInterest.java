package com.perscholas;

import java.util.Scanner;

public class CalculateInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* grab input
		 * convert input to double
		 * calculate input into monthly dues
		 * display monthly dues*/
		
		// Grabs input for each prompt
		System.out.println("How much money are you borrowing? ");
		Scanner	loanAmount = new Scanner(System.in);
		System.out.println("What is the interest rate? ");
		Scanner	monthlyInterestRate = new Scanner(System.in);
		System.out.println("How long did you borrow for? ");
		Scanner	numberOfYears = new Scanner(System.in);
		
		//change input from type String to type double
		double calculateLoan = loanAmount.nextDouble();
		double calculateInterst = monthlyInterestRate.nextDouble();
		double calculateYears = numberOfYears.nextDouble();
		
		/*perform calculation: first perform exponential operation, 
		 * second calculate monthly due */
		double interestRate = Math.pow(1+calculateInterst, calculateYears*12);
		double monthlyPayments  = (calculateLoan * calculateInterst)/(1-(1/interestRate));
		System.out.println("Your monthly due is: " + monthlyPayments);
		
		loanAmount.close();
		monthlyInterestRate.close();
		numberOfYears.close();
	
	}

}
