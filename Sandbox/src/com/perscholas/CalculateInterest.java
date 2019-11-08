/* Copyright (C) 2019  Darril Gaban

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * */

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
